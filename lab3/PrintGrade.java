class PrintGrade {
    public static void main(String[] args) {

        int score = Integer.parseInt(args[0]);
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80 && 90 > score) {
            grade = 'B';
        } else if (score >= 70 && 80 > score) {
            grade = 'C';
        } else if (score >= 60 && 70 > score) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(grade);
    }
}
