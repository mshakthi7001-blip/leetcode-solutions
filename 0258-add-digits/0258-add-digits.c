int addDigits(int num) {
    int digit;
    while(num>=10){
        digit=0; 
    while(num>0){
        digit+=num%10;
        num/=10;
    }
    num=digit;
    }
    return digit;
}