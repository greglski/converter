# converter
Uruchamiamy z parametrami wskazującymi plik wejściowy i wyjściowy: java -jar converter-1.0-SNAPSHOT.jar C:\input\csv.txt C:\output\csv.xml

Przykładowy plik wejściowy:
P|Carl Gustaf|Bernadotte 
T|0768-101801|08-101801 
A|Drottningholms slott|Stockholm|10001 
F|Victoria|1977 
A|Haga Slott|Stockholm|10002 
F|Carl Philip|1979 
T|0768-101802|08-101802 
P|Barack|Obama 
A|1600 Pennsylvania Avenue|Washington, D.C


Input file format: 
P|first name|last name 
T|mobile number|fixed number 
A|street|city|postal code 
F|name|year of birth 
P may be succeeded by T, A and F
F may be succeeded by T and A 
