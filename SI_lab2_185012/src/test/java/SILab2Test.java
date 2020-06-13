import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private final SILab2 siLab2 = new SILab2();

    @Test
    void functionEvery_statement() {
        /*
         * Ovoj test se koristi spored test primerite dobieni od every statement.
         * case1 i case2 trebaat da vratat RuntimeException so soodvetni poraki.
         * case3 treba da vrati false poradi email=null poleto vo user objektot.
         * case4 treba isto da vrati false poradi toa sto mailot nema '@' i '.' vo nego iako nema da
         * raboti bidejki treba '.' da ima posle '@', a ne da ima '.' i '@' na bilo koe mesto vo email.
         * Vo for ciklusot treba da ima razlicen if za da se resi problemot. Test caseot za ova bi bil
         * email = sample.mail@gmail.com.
         * case 5 treba da vrati true bidejki site uslovi gi pomina bez da frli nikakov exception ili
         * false.
         */
        List<String> allUsers = Arrays.asList("Username12","gorska12");
        User user = null;
        RuntimeException ex = null;
        List<String> finalAllUsers1 = allUsers;
        ex = assertThrows(RuntimeException.class, () -> siLab2.function(null, finalAllUsers1));
        assertTrue(ex.getMessage().contains("The user argument is not initialized!"));

        user = new User("Username12","password","samplemail");
        User finalUser = user;
        List<String> finalAllUsers = allUsers;
        ex = assertThrows(RuntimeException.class, () -> siLab2.function(finalUser, finalAllUsers));
        assertTrue(ex.getMessage().contains("User already exists!"));

        user = new User("username12","password12", null);
        User finalUser1 = user;
        allUsers = Arrays.asList("lolz123", "gorska12");
        assertFalse(siLab2.function(finalUser1,allUsers));

        user = new User("user_name1","pass123", "samplemail");
        User finalUser2 = user;
        allUsers = Arrays.asList("userzz#", "gorska12");
        assertFalse(siLab2.function(finalUser2,allUsers));

        user = new User("gorska","123456", "sample@gmail.com");
        User finalUser3 = user;
        allUsers = Arrays.asList("userzz#", "waterh20");
        assertTrue(siLab2.function(finalUser3,allUsers));
    }

    @Test
    void functionEvery_Path(){
        /*
        Ovoj unit e za testiranje na test cases dobieni od every path metodata
         */
        //case 1: User = null, allUsers = ["Username12","gorska12"]
        List<String> allUsers = Arrays.asList("Username12","gorska12");
        User user = null;
        RuntimeException ex = null;
        List<String> finalAllUsers = allUsers;
        ex = assertThrows(RuntimeException.class, () -> siLab2.function(null, finalAllUsers));
        assertTrue(ex.getMessage().contains("The user argument is not initialized!"));

        //case 2: User = { username = "Username12"; password = "password"; email = "samplemail"}, allUsers = ["Username12","gorska12"]
        user = new User("Username12","password","samplemail");
        User finalUser = user;
        List<String> finalAllUsers1 = allUsers;
        ex = assertThrows(RuntimeException.class, () -> siLab2.function(finalUser, finalAllUsers1));
        assertTrue(ex.getMessage().contains("User already exists!"));

        //case 3: User = { username = "username12"; password = "password12"; email = null}, allUsers = ["lolz123", "gorska12"]
        //output treba da bide false
        user = new User("username12","password12", null);
        User finalUser1 = user;
        allUsers = Arrays.asList("lolz123", "gorska12");
        assertFalse(siLab2.function(finalUser1,allUsers));

        //case 4: User =  { username = "user_name1"; password = "pass123"; email = "samplemail"}, allUsers = ["userzz#", "gorska12"]
        //output treba da bide false
        user = new User("user_name1","pass123", "samplemail");
        User finalUser2 = user;
        allUsers = Arrays.asList("userzz#", "gorska12");
        assertFalse(siLab2.function(finalUser2,allUsers));


        //case 5: User =  { username = "userthename1"; password = "xbox123"; email = "sample.mail"}, allUsers = ["userzz123", "Oeuf"]
        //outputot treba da bide false
        user = new User("userthename1","xbox123", "sample.mail");
        User finalUser3 = user;
        allUsers = Arrays.asList("userzz123", "Oeuf");
        assertFalse(siLab2.function(finalUser3,allUsers));

        //case 6: User =  { username = "userTHEname"; password = "ps5123"; email = "sample@mail"}, allUsers = ["ladna_voda123", "Ouef"]
        //output treba da bide false
        user = new User("userTHEname","ps5123", "sample@mail");
        User finalUser4 = user;
        allUsers = Arrays.asList("ladna_voda123","Ouef");
        assertFalse(siLab2.function(finalUser4,allUsers));

        //case 7: User =  { username = "gorska"; password = "123456"; email = "sample@gmail.com"}, allUsers = ["userzz#", "waterh20"]
        //output treba da e true
        user = new User("gorska","123456", "sample@gmail.com");
        User finalUser5 = user;
        allUsers = Arrays.asList("userzz#", "waterh20");
        assertTrue(siLab2.function(finalUser5,allUsers));

        //case 8: User =  { username = "sample_name"; password = "sample_password123"; email = ""}, allUsers = ["userzz#", "gorska12"]
        //output treba da e false
        user = new User("sample_name","sample_password123", "");
        User finalUser6 = user;
        allUsers = Arrays.asList("userzz#", "gorska12");
        assertFalse(siLab2.function(finalUser6,allUsers));
    }
}