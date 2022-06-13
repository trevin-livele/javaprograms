public class account {


    public class Account{
        private String number;
        private Double balance;
        private String customerName;
        private String customerEmailAddress;
        private String customerPhoneNumber;
        public Account() {
            System.out.println("Empty constructor called"
        }
        public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {


            this.number=number;
            this.balance= balance;
            this.customerName = customerName;
            this.customerEmailAddress = customerEmailAddress;
            this.customerPhoneNumber = customerPhoneNumber;
        }


            );
        }


        public void deposit(double depositAmount) {
            this.balance += depositAmount;
            System.out.println("Deposit of " + depositAmount + "made. New balance is " + this.balance);
        }

        public void withdrawal(double withdrawalAmount) {
            if(this.balance - withdrawalAmount <=0) {
                System.out.println("only" + this.balance + "available.withdrawal not processed");
            }else{
                this.balance -= withdrawalAmount;
                System.out.println("withdrawal of " + withdrawalAmount + "processed. remaining balance = " + balance);
            }
        }








        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public Double getBalance() {
            return balance;
        }

        public void setBalance(Double balance) {
            this.balance = balance;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerEmailAddress() {
            return customerEmailAddress;
        }

        public void setCustomerEmailAddress(String customerEmailAddress) {
            this.customerEmailAddress = customerEmailAddress;
        }

        public String getCustomerPhoneNumber() {
            return customerPhoneNumber;
        }

        public void setCustomerPhoneNumber(String customerPhoneNumber) {
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
}


