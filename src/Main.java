public class Main {
    public static void main(String[] args) {
        /** Metehan Elmas **/

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course fizikS = new Course("Sözlu", "SZL101","SZL");
        Course kimyaS = new Course("Sözlu", "SZL101","SZL");
        Course  matS = new Course("Sözlu", "SZL101","SZL");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya,fizikS,kimyaS,matS);
        s1.addBulkExamNote(50,20,40, 50 , 60 , 80 );
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133",mat, fizik, kimya,fizikS,kimyaS,matS);
        s2.addBulkExamNote(100,50,40, 75, 90,90);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya,fizikS,kimyaS,matS);
        s3.addBulkExamNote(50,20,40, 50 , 89,76);
        s3.isPass();

    }
}