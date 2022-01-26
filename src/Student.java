public class Student {
    /** Metehan Elmas **/

    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course fizikS;
    Course kimyaS;
    Course matS;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya,Course fizikS,Course kimyaS,Course matS) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.fizikS= fizikS;
        this.kimyaS = kimyaS;
        this.matS = matS;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya,int fizikS,int kimyaS,int matS) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (fizikS >= 0 && fizikS <= 100) {
            this.fizikS.note = fizikS;
        }
        if (kimyaS >= 0 && kimyaS <= 100) {
            this.kimyaS.note = kimyaS;
        }
        if (matS >= 0 && matS <= 100) {
            this.matS.note = matS;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.fizikS.note == 0 || this.kimyaS.note == 0 || this.matS.note == 0 ) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note * 0.80 + (this.fizikS.note*0.80)) + (this.kimya.note*0.80+ (this.kimyaS.note*0.20)) + (this.mat.note*0.80+(this.matS.note*0.20))) / 3;
    }


    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " Matematik Sözlü Notu : " + matS.note);
        System.out.println("Fizik Notu : " + this.fizik.note +  " Fizik Sözlü Notu : " + fizikS.note);
        System.out.println("Kimya Notu : " + this.kimya.note +   " Kimya Sözlü Notu : " + kimyaS.note);
    }

}