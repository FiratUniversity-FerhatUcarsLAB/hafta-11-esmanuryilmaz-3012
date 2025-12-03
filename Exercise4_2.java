public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) {      // 1
        zippo("rattle", 13);                      // 2
    }

    public static void baffle(String blimp) {
        System.out.println(blimp);                // 6
        zippo("ping", -5);                        // 7
    }

    public static void zippo(String quince, int flag) {
        if (flag < 0) {                           // 3, 8
            System.out.println(quince + " zoop"); // 9
        } else {
            System.out.println("ik");             // 4
            baffle(quince);                       // 5
            System.out.println("boo-wa-ha-ha");   // 10
        }
    }
}

Programın Tam Çıktısı:
ik
rattle
ping zoop
boo-wa-ha-ha
