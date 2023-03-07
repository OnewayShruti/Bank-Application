# Bank-Application
Developed efficient and scalable bank account application with multiple classes and interfaces to manage customer requests and transactions. Features include CSV file reading and account access code generation.

The proposed project is a bank account application that allows the creation of new customer requests. The application is designed using multiple classes and interfaces that provide the necessary functionality to manage customer requests and create new bank accounts.

The main class manages the list of all bank accounts and reads data from a CSV file. The application creates a linked list of type BankAccount to store all the accounts created. The file location is stored as a string, and the data read from the CSV file is stored as strings in the list. The application traverses through every element of the list and initializes the variables, calling the Savings/Checkings type constructor after checking the account type. The superclass BankAccount constructor is called to initialize the common properties. To generate the last two digits of the account number, the application uses the modulo operation by 100. To generate a 3-digit random number, the application multiplies the random number by 1000 or a power of 3.

The application includes a BaseRateInterface, which contains a default method to return the set base rate. This interface is implemented by the BankAccount class, which contains all the common properties and methods necessary for managing bank accounts. The CheckingAccount and SavingAccount classes override the interface method to set the interest rates according to the account type. These classes also generate the access codes required to manage account access.

The application's CSV file functionality reads every row of the sheet, splits it according to a delimiter, and stores it into the list. This feature allows the application to manage large sets of customer requests easily.

Overall, the application is efficient and easy to use. The use of classes and interfaces ensures that the application is scalable and can be extended to include additional functionality. The BankAccount class also contains methods to perform transactions, making it a comprehensive banking solution.
