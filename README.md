# SI_lab2_185012
Втора лабораториска вежба по Софтверско Инженерство
Кристијан Костески 185012
Група на код:
Ја добив групата на код 2
Control Flow Graph:
Не може да се стави во notepad документ па затоа е во самиот file за SI_lab2_185012
Цикломатска Комплексност:
Таа е еднаква на 6. Пресметана е со формулата V(G) = E – N + 2.
Каде V(G) = 20 - 16 + 2 = 6
Тест случаи според every statement методата
Тест примерите ќе бидат 5 и тие се:

case 1: User = null, allUsers = ["Username12", "gorska12"]

case 2: User = { username = "Username12"; password = "password"; email = "samplemail"}, allUsers = ["Username12","gorska12"]

case 3: User = { username = "username12"; password = "password12"; email = null}, allUsers = ["lolz123", "gorska12"]

case 4: User =  { username = "user_name1"; password = "pass123"; email = "samplemail"}, allUsers = ["userzz#", "gorska12"]

case 5: User =  { username = "gorska"; password = "123456"; email = "sample@gmail.com"}, allUsers = ["userzz#", "waterh20"]

Имам прикачено и слика со матрицата направена за every statement методата.

Тест случаи според every path методата
Тест примерите ќе бидат 8 и тие се:

pateka:ABP
case 1: User = null, allUsers = ["Username12","gorska12"]

pateka:ACDP
case 2: User = { username = "Username12"; password = "password"; email = "samplemail"}, allUsers = ["Username12","gorska12"]

pateka:ACEF
case 3: User = { username = "username12"; password = "password12"; email = null}, allUsers = ["lolz123", "gorska12"]

pateka:ACEGHJLIHNO
case 4: User =  { username = "user_name1"; password = "pass123"; email = "samplemail"}, allUsers = ["userzz#", "gorska12"]

pateka:ACEGHJLMIHNO
case 5: User =  { username = "userthename1"; password = "xbox123"; email = "sample.mail"}, allUsers = ["userzz123", "Oeuf"]

pateka:ACEGHJKLIHNO
case 6: User =  { username = "userTHEname"; password = "ps5123"; email = "sample@mail"}, allUsers = ["ladna_voda123", "Ouef"]

pateka:ACEGHJKLMIHNP
case 7: User =  { username = "gorska"; password = "123456"; email = "sample@gmail.com"}, allUsers = ["userzz#", "waterh20"]

pateka:ACEGHNO
case 8: User =  { username = "sample_name"; password = "sample_password123"; email = ""}, allUsers = ["userzz#", "gorska12"]

Имам и прикачено слика со матрицата направена за every path методата

Објаснување на напишаните unit tests:
Првите две се assertThrows за да провериме дали соодветно се фрла RuntimeException и дали се принтаат соодветните пораки.
Следните блокови се напишани за да видиме што враќа функцијата (true или false) зависно од тест примерите.
Тие имаат или assertTrue или assertFalse зависно од тоа дали очекуваме true или false. Бидејќи самата функција враќа true или false
можеме само така да ја ставиме во assertовите.
Едната функција е со тест примерите добиени од every statement методата кои наведени се во овој фајл погоре.
Другата функција е со тест примерите добиени од every path методата кои наведени се во овој фајл погоре.

