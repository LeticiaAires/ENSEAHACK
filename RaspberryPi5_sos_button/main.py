#!/usr/bin/env python3

print("FDefend: ON!")

import RPi.GPIO as GPIO # Import Raspberry Pi GPIO library
import bluetooth

def send_bluetooth_message(device_address, message, port=1):
    """
    Sends a message through a bluetooth connection.
    - RFCOMM port number (must match the port on the receiving device)
    """
    try:
        # Create a Bluetooth socket
        sock = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
        
        # Connect to the Bluetooth device
        sock.connect((device_address, port))
        
        # Send the message
        sock.send(message)
        
        # Close the socket
        sock.close()
        
        print(f"Message sent to {device_address} successfully.")
        
    except Exception as e:
        print(f"Error: {e}")

def send_message_to_all_paired_devices(message):
    try:
        # Get a list of paired devices
        paired_devices = bluetooth.discover_devices(lookup_names=True, lookup_class=True)

        # Iterate over paired devices and send the message
        for device_address, device_name, _ in paired_devices:
            send_bluetooth_message(device_address, message)
        
    except Exception as e:
        print(f"Error: {e}")

print("FDefend: Bluetooth set up successfuly")

# Message to send
message_to_send = "Hello from Raspberry Pi!"

sos_button_pin = 15
alert_led_pin = 23

GPIO.setwarnings(False) # Ignore warning for now
#GPIO.setmode(GPIO.BOARD) # Use physical pin numbering
GPIO.setmode(GPIO.BCM)
GPIO.setup(sos_button_pin, GPIO.IN, pull_up_down=GPIO.PUD_DOWN) # Set pin 10 to be an input pin and set initial value to be pulled low (off)
GPIO.setup(alert_led_pin, GPIO.OUT)
GPIO.output(alert_led_pin, GPIO.LOW)

print("FDefend: GPIO set up successfully.")

# Test GPIO
'''
while True: # Run forever
    state = GPIO.input(sos_button_gpio)
    print(state)
    
    if state == GPIO.LOW:
        print("Button was pushed!")
'''

def button_callback(channel):
    print("Button was pushed!")
    GPIO.output(alert_led_pin, GPIO.HIGH)
    # Call the function to send the Bluetooth message to all paired devices
    send_message_to_all_paired_devices(message_to_send)
    GPIO.output(alert_led_pin, GPIO.LOW)
    
GPIO.add_event_detect(sos_button_pin,GPIO.RISING,callback=button_callback) # Setup event on pin 10 rising edge

message = input("Press enter to quit\n\n") # Run until someone presses enter
GPIO.cleanup() # Clean up