# SOS Button
> *"Sends an alert and turns the led on at the push of the button."*  
On Raspberry Pi 5, it requires to install bluez for Python3 in order to use the module `bluetooth`: 
```bash
sudo apt-get install python3-bluez
```

The main functionality runs when the script is launched and and is disabled on the press of any key from a keyboard.