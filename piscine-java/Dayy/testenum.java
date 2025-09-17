enum Day {
   SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY 
}
class EnumTes{
    Day day;
    public EnumTes(Day day){
        this.day = day;
    }
    public void tellItLiekeItIs(){
        switch(day) {
            case MONDAY:
                System.out.println("Monday are bad.");
                break;
                case FRIDAY:
                System.out.println("Friday are better.");
                break;
                case SATURDAY: case SUNDAY:
                System.out.println("Wekends are best");
                default:
                System.out.println("Midweek days are so-so good");
                break; 
        }
    }
    public static void main(String[] args){
        EnumTes firstDay = new EnumTes(Day.MONDAY);
        firstDay.tellItLiekeItIs();
    }
}