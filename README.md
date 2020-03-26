# Agent-CoronaVirus-JADE

## In order to run, add new Run Configuration:
  type: Application</br>
  Main class: jade.Boot</br>
  Program arguments: -gui -agents corona:VirusAgent(CoronaVirus,1000)</br>
  
  The second parameter of the corona:VirusAgent(CoronaVirus,1000) is the number of healthy humans. 
 
## Example output:
#### For 1000 healthy humans and 1 infected using below changable parameters</br>
Parameters in percentage: </br>
- killChance = 5</br>
- cureChance = 30</br>
- infectChance = 40</br>
     
 After 212 days the virus killed 991 of them, leaving 10 survivals.
