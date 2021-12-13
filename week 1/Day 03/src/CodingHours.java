public class CodingHours {
    public static void main(String[] args) {

        double StudyDays = 5;
        double Semester = 17;
        double DailyHours = 6;
        double WorkHoursPerWeek = 52;
        double workingHoursPerSemester = Semester * StudyDays * DailyHours;
        System.out.println(workingHoursPerSemester);

        double hoursInSemester = Semester * 7 * 24;
        System.out.println(hoursInSemester);
        double percent = workingHoursPerSemester / hoursInSemester * 100;
        System.out.println(percent);



    }


}
