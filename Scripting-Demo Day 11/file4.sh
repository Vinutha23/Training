echo "this is the test file">file.txt
echo "Another line">>file.txt
cat file.txt
rm file.txt


if [ -f "file.txt" ];then 
    echo "File exists"
else
    echo "File does not exists"
fi
