echo "Hello from bash"
name="Vinutha"
echo "hello $name"

salary=100000
echo "Salary $salary"
echo "salary $((salary*20))"
num1=10
num2=20
echo "sum $((num1+num2))"


numbers=(10 20 30 40 50)
echo "First Number${numbers[0]}"
echo "Second Number${numbers[1]}"

names=("alex" "bob" "catty" "david")
echo "First Name :${names[0]}"



echo "Current User:$USER"
echo "Home Directory: $HOME"

readonly PI=3.14
echo "Value of PI:$PI"
# PI=3.89


echo "Script Name $0"
echo "NO of Arguments :$#"
echo "First of Arguments: $1"
echo "Second of Arguments: $2"
echo "Third of Arguments :$3"

echo "enter the number:"
read num
if [ $num -gt 10 ]; then 
    echo "The number is greater than 10"
else
    echo "The number is not greater than 10"
fi 

echo "Enter your age:"
read age
echo "are you indian"
read citizen
if [ $age -ge 18 ] && [ $citizen=="yes" ] || [ $citizen == "YES" ];then
    echo "You are eligible for vote"
else
    echo "You are not weligible for vote"
fi 


echo "Enter your choice (start / stop / restart):"
read choice
case $choice in 
    start)
        echo "starting the service..."
        ;;
    stop)
        echo "Stroping the service..."
        ;;
    restart)
        echo "Restarting the service.."
        ;;
    *)
        echo "Invalid choice .please enter the valid one"
        ;;
esac