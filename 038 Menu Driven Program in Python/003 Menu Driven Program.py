def cse():
    print("You will get the following subjects")
    print("DSA")
    print("DBMS")
    print("Computer Networks (CN)")

def it():
    print("You will get the following subjects")
    print("DSA")
    print("DBMS")
    print("Computer Networks (CN)")
    print("MPMC (Multi processor and Multi Controller)")
    print("Information Security")

def ece():
    print("You will get the following subjects")
    print("Wireless Communication")
    print("Switching Theory and Logic Design (STLD)")
    print("Mobile Systems Communication")

def ee():
    print("You will get the following subjects")
    print("Switching Theory and Logic Design (STLD)")
    print("Control Systems")
    print("Electrical Circuits and Designs")

def mech():
    print("You will get the following subjects")
    print("Force and Friction")
    print("Motors and its Types")

def main():
    print("Welcome to PrepBytes University Portal!!!")
    print("Select one of the following streams in which you want to study")
    while(True):
        print("1. Computer Science")
        print("2. Information Technology")
        print("3. Electronics and Communication")
        print("4. Electrical and Electronics")
        print("5. Mechanical")
        print("10. Exit")

        print("Enter the choice number from above")
        choice = int(input())

        if choice == 1:
            print("You have chosen Computer Science.");
            cse();
            print("Are you sure you want to lock this stream? Choose either A or B.")
            print("A. Yes, I'm sure")
            print("B. No, I'm not sure")
            ch = input()[0]
            if ch == 'A':
                print("Congratulations!! You are now a CSE student at PrepBytes");
                break
        elif choice == 2:
            print("You have chosen Information Technology.");
            it();
            print("Are you sure you want to lock this stream? Choose either A or B.")
            print("A. Yes, I'm sure")
            print("B. No, I'm not sure")
            ch = input()[0]
            if ch == 'A':
                print("Congratulations!! You are now an IT student at PrepBytes");
                break
        elif choice == 3:
            print("You have chosen Electronics and Communication.");
            ece();
            print("Are you sure you want to lock this stream? Choose either A or B.")
            print("A. Yes, I'm sure")
            print("B. No, I'm not sure")
            ch = input()[0]
            if ch == 'A':
                print("Congratulations!! You are now an ECE student at PrepBytes");
                break
        elif choice == 4:
            print("You have chosen Electrical and Electronics.");
            ee();
            print("Are you sure you want to lock this stream? Choose either A or B.")
            print("A. Yes, I'm sure")
            print("B. No, I'm not sure")
            ch = input()[0]
            if ch == 'A':
                print("Congratulations!! You are now an EE student at PrepBytes");
                break
        elif choice == 5:
            print("You have chosen Mechanical Engineering.");
            mech();
            print("Are you sure you want to lock this stream? Choose either A or B.")
            print("A. Yes, I'm sure")
            print("B. No, I'm not sure")
            ch = input()[0]
            if ch == 'A':
                print("Congratulations!! You are now a ME student at PrepBytes");
                break
        elif choice == 10:
            break
        else:
            print("You have entered an invalid choice.")

if __name__ == '__main__':
    main()
