echo "Enter your choice (start / stop / restart):"
read choice
case $choice in 
    start)
        echo "starting the service..."
        ;;
    stop)
        echo "Stoping the service..."
        ;;
    restart)
        echo "Restarting the service.."
        ;;
    *)
        echo "Invalid choice .please enter the valid one"
        ;;
esac