
class InputConvertFieldToLocalVariable8
{
    public int x; // ok, skip public
    
    int bar(int y) {
        x = y + 5;
        return x;
    }
}