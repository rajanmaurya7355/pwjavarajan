class evenodd{
    public static void main(String args[]){
  int n1=150,n2=170,n3=180;
int year=2016;
if(year%24==0 && year%400==0 && year%2 !=0)
{
    System.out.println("leap year");
}
else{
    System.out.println("not leap");
}
}}