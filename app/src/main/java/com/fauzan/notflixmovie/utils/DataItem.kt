package com.fauzan.notflixmovie.utils

import com.fauzan.notflixmovie.model.Movies

object DataItem {

    fun generateMovie(): List<Movies> {

        val movies = ArrayList<Movies>()

        movies.add(
            Movies(
                "M1",
                "The Shawshank Redemption",
                "Drama",
                "9.3",
                "USA",
                "Chronicles the experiences of a formerly successful banker as a prisoner in the gloomy jailhouse of Shawshank after being found guilty of a crime he did not commit. The film portrays the man's unique way of dealing with his new, torturous life; along the way he befriends a number of fellow prisoners, most notably a wise long-term inmate named Red.",
                "Frank Darabont",
                "Fear can hold you prisoner. Hope can set you free.",
                "Tim Robbins, Morgan Freeman, Bob Gunton",
                "https://m.media-amazon.com/images/M/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BNjQ2NDA3MDcxMF5BMl5BanBnXkFtZTgwMjE5NTU0NzE@._V1_CR0,60,640,360_AL_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        movies.add(
            Movies(
                "M2",
                "The Godfather",
                "Crime, Drama",
                "9.2",
                "USA",
                "The Godfather \"Don\" Vito Corleone is the head of the Corleone mafia family in New York. He is at the event of his daughter's wedding. Michael, Vito's youngest son and a decorated WW II Marine is also present at the wedding. Michael seems to be uninterested in being a part of the family business. Vito is a powerful man, and is kind to all those who give him respect but is ruthless against those who do not. But when a powerful and treacherous rival wants to sell drugs and needs the Don's influence for the same, Vito refuses to do it. What follows is a clash between Vito's fading old values and the new ways which may cause Michael to do the thing he was most reluctant in doing and wage a mob war against all the other mafia families which could tear the Corleone family apart.",
                "Mario Puzo, Francis Ford Coppola",
                "An offer you can't refuse.",
                "Marlon Brando, Al Pacino, James Caan",
                "https://m.media-amazon.com/images/M/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UY268_CR3,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTY5OTE4MDM5N15BMl5BanBnXkFtZTcwNDAyMDg0Nw@@._V1_CR0,60,640,360_AL_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        movies.add(
            Movies(
                "M3",
                "The Dark Knight",
                "Action, Crime, Drama",
                "9.0",
                "USA, UK",
                "Set within a year after the events of Batman Begins (2005), Batman, Lieutenant James Gordon, and new District Attorney Harvey Dent successfully begin to round up the criminals that plague Gotham City, until a mysterious and sadistic criminal mastermind known only as \"The Joker\" appears in Gotham, creating a new wave of chaos. Batman's struggle against The Joker becomes deeply personal, forcing him to \"confront everything he believes\" and improve his technology to stop him. A love triangle develops between Bruce Wayne, Dent, and Rachel Dawes.",
                "Jonathan Nolan, Christopher Nolan",
                "Why So Serious?",
                "Christian Bale, Heath Ledger, Aaron Eckhart",
                "https://m.media-amazon.com/images/M/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BNWJkYWJlOWMtY2ZhZi00YWM0LTliZDktYmRiMGYwNzczMTZhXkEyXkFqcGdeQXVyNzU1NzE3NTg@._V1_CR0,45,480,270_AL_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        movies.add(
            Movies(
                "M4",
                "Schindler's List",
                "Biography, Drama, History",
                "8.9",
                "USA",
                "Oskar Schindler is a vain and greedy German businessman who becomes an unlikely humanitarian amid the barbaric German Nazi reign when he feels compelled to turn his factory into a refuge for Jews. Based on the true story of Oskar Schindler who managed to save about 1100 Jews from being gassed at the Auschwitz concentration camp, it is a testament to the good in all of us.",
                "Thomas Keneally, Steven Zaillian",
                "Whoever saves one life, saves the world entire.",
                "Liam Neeson, Ralph Fiennes, Ben Kingsley",
                "https://m.media-amazon.com/images/M/MV5BNDE4OTMxMTctNmRhYy00NWE2LTg3YzItYTk3M2UwOTU5Njg4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BOTIxMTUzMmUtODU2MS00MDhjLTlmMGQtMzNhZTFhOTI5ZjE5XkEyXkFqcGdeQXRoaXJkLXBhcnR5LXZpZGVvLXVwZGF0ZXI@._V1_CR0,45,480,270_AL_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        movies.add(
            Movies(
                "M5",
                "The Lord of the Rings: The Return of the King",
                "Action, Adventure, Drama",
                "8.9",
                "New Zealand, USA",
                "The final confrontation between the forces of good and evil fighting for control of the future of Middle-earth. Frodo and Sam reach Mordor in their quest to destroy the One Ring, while Aragorn leads the forces of good against Sauron's evil army at the stone city of Minas Tirith.",
                "J.R.R. Tolkien, Fran Walsh",
                "There can be no triumph without loss. No victory without suffering. No freedom without sacrifice.",
                "Elijah Wood, Viggo Mortensen, Ian McKellen",
                "https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BODk1MzkwNTA4N15BMl5BanBnXkFtZTgwOTU1ODY3MjI@._V1_CR0,60,640,360_AL_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        movies.add(
            Movies(
                "M6",
                "Forrest Gump",
                "Drama, Romance",
                "8.8",
                "USA",
                "Forrest Gump is a simple man with a low I.Q. but good intentions. He is running through childhood with his best and only friend Jenny. His 'mama' teaches him the ways of life and leaves him to choose his destiny. Forrest joins the army for service in Vietnam, finding new friends called Dan and Bubba, he wins medals, creates a famous shrimp fishing fleet, inspires people to jog, starts a ping-pong craze, creates the smiley, writes bumper stickers and songs, donates to people and meets the president several times. However, this is all irrelevant to Forrest who can only think of his childhood sweetheart Jenny Curran, who has messed up her life. Although in the end all he wants to prove is that anyone can love anyone.",
                "Winston Groom, Eric Roth",
                "Life is like a box of chocolates...you never know what you're gonna get.",
                "Tom Hanks, Robin Wright, Gary Sinise",
                "https://m.media-amazon.com/images/M/MV5BNWIwODRlZTUtY2U3ZS00Yzg1LWJhNzYtMmZiYmEyNmU1NjMzXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UY268_CR1,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BYzQyMWQ1ODMtZGE2OS00YzQyLWE2OWYtZmU5OGFiMWMwYmIyXkEyXkFqcGdeQXVyNzU1NzE3NTg@._V1_CR0,45,480,270_AL_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        movies.add(
            Movies(
                "M7",
                "Inception",
                "Action, Adventure, Sci-Fi",
                "8.8",
                "USA, UK",
                "Dom Cobb is a skilled thief, the absolute best in the dangerous art of extraction, stealing valuable secrets from deep within the subconscious during the dream state, when the mind is at its most vulnerable. Cobb's rare ability has made him a coveted player in this treacherous new world of corporate espionage, but it has also made him an international fugitive and cost him everything he has ever loved. Now Cobb is being offered a chance at redemption. One last job could give him his life back but only if he can accomplish the impossible, inception. Instead of the perfect heist, Cobb and his team of specialists have to pull off the reverse: their task is not to steal an idea, but to plant one. If they succeed, it could be the perfect crime. But no amount of careful planning or expertise can prepare the team for the dangerous enemy that seems to predict their every move. An enemy that only Cobb could have seen coming.",
                "Christopher Nolan",
                "Your mind is the scene of the crime",
                "Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page",
                "https://m.media-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTQ1ZmIzOTAtNDcwZi00NDVkLWE4NWItYWNhZGY1MmVlZGU0XkEyXkFqcGdeQWRvb2xpbmhk._V1_CR1,0,1904,1071_AL_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        movies.add(
            Movies(
                "M8",
                "The Matrix",
                "Action, Sci-Fi",
                "8.7",
                "USA",
                "Thomas A. Anderson is a man living two lives. By day he is an average computer programmer and by night a hacker known as Neo. Neo has always questioned his reality, but the truth is far beyond his imagination. Neo finds himself targeted by the police when he is contacted by Morpheus, a legendary computer hacker branded a terrorist by the government. As a rebel against the machines, Neo must confront the agents: super-powerful computer programs devoted to stopping Neo and the entire human rebellion.",
                "Lilly Wachowski, Lana Wachowski",
                "The World's population thinks it's real. On March 31st, they will see the \"Real World\" ",
                "Keanu Reeves, Laurence Fishburne, Carrie-Anne Moss",
                "https://m.media-amazon.com/images/M/MV5BNzQzOTk3OTAtNDQ0Zi00ZTVkLWI0MTEtMDllZjNkYzNjNTc4L2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BNDQ4NTRmN2ItYjgzMS00MzY3LWEwNmYtYmE2ODllZDdhNGI1XkEyXkFqcGdeQXdvbmtpbQ@@._V1_CR77,0,1895,1066_AL_UY268_CR19,0,477,268_AL_.jpg"

            )
        )

        movies.add(
            Movies(
                "M9",
                "Life is Beautiful",
                "Comedy, Drama, Romance",
                "8.6",
                "Italy",
                "In 1930s Italy, a carefree Jewish book keeper named Guido starts a fairy tale life by courting and marrying a lovely woman from a nearby city. Guido and his wife have a son and live happily together until the occupation of Italy by German forces. In an attempt to hold his family together and help his son survive the horrors of a Jewish Concentration Camp, Guido imagines that the Holocaust is a game and that the grand prize for winning is a tank.",
                "Vincenzo Cerami, Roberto Benigni",
                "An unforgettable fable that proves love, family and imagination conquer all. (Canadian one sheet)",
                "Roberto Benigni, Nicoletta Braschi, Giorgio Cantarini",
                "https://m.media-amazon.com/images/M/MV5BYmJmM2Q4NmMtYThmNC00ZjRlLWEyZmItZTIwOTBlZDQ3NTQ1XkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMWZjZGZiNjktZjk4MS00ODVmLWFhNzQtMWE4MThhOWNkOGZlXkEyXkFqcGdeQXRyYW5zY29kZS13b3JrZmxvdw@@._V1_CR0,36,384,216_AL_UX477_CR0,0,477,268_AL_.jpg"

            )
        )

        movies.add(
            Movies(
                "M10",
                "The Silence of the Lambs",
                "Crime, Drama, Thriller",
                "8.6",
                "USA",
                "F.B.I. trainee Clarice Starling (Jodie Foster) works hard to advance her career, while trying to hide or put behind her West Virginia roots, of which if some knew, would automatically classify her as being backward or white trash. After graduation, she aspires to work in the agency's Behavioral Science Unit under the leadership of Jack Crawford (Scott Glenn). While she is still a trainee, Crawford asks her to question Dr. Hannibal Lecter (Sir Anthony Hopkins), a psychiatrist imprisoned, thus far, for eight years in maximum security isolation for being a serial killer who cannibalized his victims.",
                "Thomas Harris, Ted Tally",
                "To enter the mind of a killer she must challenge the mind of a madman.",
                "Jodie Foster, Anthony Hopkins, Lawrence A. Bonney",
                "https://m.media-amazon.com/images/M/MV5BNjNhZTk0ZmEtNjJhMi00YzFlLWE1MmEtYzM1M2ZmMGMwMTU4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BN2ZiYzIyMWQtNDUyNy00YmExLWIwNmMtN2FhNzFiODgyYmU4XkEyXkFqcGdeQXRodW1ibmFpbC1pbml0aWFsaXplcg@@._V1_CR38,0,1845,1038_AL_UY268_CR9,0,477,268_AL_.jpg"

            )
        )

        return movies
    }

    fun generateTvShow(): List<Movies> {

        val tvShow = ArrayList<Movies>()

        tvShow.add(
            Movies(
                "T1",
                "The Boys",
                "Action, Comedy, Crime, Sci-Fi",
                "8.7",
                "USA",
                "The Boys is set in a universe where superpowered people are recognized as heroes by the general public and owned by powerful corporation Vought International, which ensures that they are aggressively marketed and monetized. Outside of their heroic personas, most are arrogant and corrupt. The series primarily focuses on two groups: the titular Boys, vigilantes looking to keep the corrupted heroes under control, and the Seven, Vought International's premier superhero team. The Boys are led by Billy Butcher, who despises all superpowered people, and the Seven are led by the egotistical and unstable Homelander. As a conflict ensues between the two groups, the series also follows the new members of each team: Hugh \"Hughie\" Campbell of the Boys, who joins the vigilantes after his girlfriend is killed in a high speed collision by the Seven's A-Train, and Annie January / Starlight of the Seven, a young and hopeful heroine forced to face the truth about the heroes she admires.",
                "Eric Kripke, Evan Goldberg, Seth Rogen",
                "Never Meet Your Heroes",
                "Karl Urban, Jack Quaid, Antony Starr",
                "https://m.media-amazon.com/images/M/MV5BN2JjNmFjZmItMDVlMS00NzExLWJkOTMtY2U3ZDRiZGUyMTdhXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BN2RmNjEzMGQtOWNlOS00MzU1LTk2MTgtNjhlMjExZDg0ZWI4XkEyXkFqcGdeQXZ3ZXNsZXk@._V1_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        tvShow.add(
            Movies(
                "T2",
                "Game Of Thrones",
                "Action, Adventure, Drama, Fantasy, Romance",
                "9.3",
                "USA, UK",
                "In the mythical continent of Westeros, several powerful families fight for control of the Seven Kingdoms. As conflict erupts in the kingdoms of men, an ancient enemy rises once again to threaten them all. Meanwhile, the last heirs of a recently usurped dynasty plot to take back their homeland from across the Narrow Sea.",
                "David Benioff, D.B. Weiss",
                "The Great War Is Here (Season 8)",
                "Emilia Clarke, Peter Dinklage, Kit Harington",
                "https://m.media-amazon.com/images/M/MV5BYTRiNDQwYzAtMzVlZS00NTI5LWJjYjUtMzkwNTUzMWMxZTllXkEyXkFqcGdeQXVyNDIzMzcwNjc@._V1_UY268_CR7,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BYWU5YTUzYmQtNWRkOS00MmQyLWEzYzAtN2UyOTA2ZTM3N2EyXkEyXkFqcGdeQXZ3ZXNsZXk@._V1_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        tvShow.add(
            Movies(
                "T3",
                "Vikings",
                "Action, Adventure, Drama",
                "8.5",
                "Ireland, Canada",
                "The adventures of a Ragnar Lothbrok: the greatest hero of his age. The series tells the saga of Ragnar's band of Viking brothers and his family as he rises to become King of the Viking tribes. As well as being a fearless warrior, Ragnar embodies the Norse traditions of devotion to the gods: legend has it that he was a direct descendant of Odin, the god of war and warriors.",
                "Michael Hirst",
                "Who will rise? (Season 5)",
                "Katheryn Winnick, Alexander Ludwig, Gustaf Skarsgård",
                "https://m.media-amazon.com/images/M/MV5BNjIzZjljZmQtOGNiYi00YmY2LWE1MGYtN2VlMmEyZDBlMzRmXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMjc4NzM3OTQtZWVhZC00MjI0LTk0MTItZmMwYmM4YTZlMDRkXkEyXkFqcGdeQWFybm8@._V1_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        tvShow.add(
            Movies(
                "T4",
                "Agents of S.H.I.E.L.D",
                "Action, Adventure, Drama",
                "7.5",
                "USA",
                "Agents of Shield is one of the best superhero/comic book themed shows out there, and I'm not kidding. All of the hate this series gets is completely unwarranted, and the hate comes from those who only watched the first half season. Ever since then, this show has been on the up, improving every season. Sure, it has a slow and not very strong start, but Agents of Shield gets progressively better as you continue through the series. And the improvement is so drastic that this has become one of the best TV shows I've seen.",
                "Maurissa Tancharoen, Jed Whedon, Joss Whedon",
                "Are you inhuman? (season 3)",
                "Clark Gregg, Ming-Na Wen, Brett Dalton",
                "https://m.media-amazon.com/images/M/MV5BOTJhMjhhZDItZTQxMi00NGM3LTliZjYtMjcyMWE2YzYwNTA0XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UY268_CR16,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BOGNkMTk5ZDQtNmQzNC00M2IzLTgzMjUtMmQwYjYwNjFjZjUxXkEyXkFqcGdeQXZ3ZXNsZXk@._V1_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        tvShow.add(
            Movies(
                "T5",
                "Money Heist",
                "Action, Crime, Mystery",
                "8.4",
                "Spain",
                "An unusual group of robbers attempt to carry out the most perfect robbery in Spanish history - stealing 2.4 billion euros from the Royal Mint of Spain.",
                "Alex Pina",
                "-",
                "Úrsula Corberó, Álvaro Morte, Itziar Ituño",
                "https://m.media-amazon.com/images/M/MV5BZDcxOGI0MDYtNTc5NS00NDUzLWFkOTItNDIxZjI0OTllNTljXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://occ-0-58-64.1.nflxso.net/dnm/api/v6/9pS1daC2n6UGc3dUogvWIPMR_OU/AAAABdMWxIfRS53nNri_Vml_QCJSj8HTL9xpJpHGf2S3G6fSo_ZBm2WLvqqffviZXRa7guCZ9qvs-IA7ycX-M3YxBRYWYSTEPRZ0s-b6iwa-aPMsRtJP.jpg?r=940"
            )
        )

        tvShow.add(
            Movies(
                "T6",
                "Doom Patrol",
                "Action, Adventure, Comedy",
                "8.0",
                "USA",
                "A re-imagining of one of DC's most beloved group of outcast Super Heroes: Robotman, Negative Man, Elasti-Girl and Crazy Jane, led by modern-day mad scientist Dr. Niles Caulder (The Chief). The Doom Patrol's members each suffered horrible accidents that gave them superhuman abilities - but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence - and to protect Earth from what they find. Part support group, part Super Hero team, the Doom Patrol is a band of super-powered freaks who fight for a world that wants nothing to do with them.",
                "Jeremy Carver",
                "-",
                "Diane Guerrero, April Bowlby, Matt Bomer",
                "https://m.media-amazon.com/images/M/MV5BM2I1OWZiNTUtZGNmOS00NGNiLTlhZmItOTU3MGRlMWFkYWU3XkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BMTBkZWNlMDYtY2RiOS00YzkwLWJlOWYtZGYyODdiZTQxMmU2XkEyXkFqcGdeQXZ3ZXNsZXk@._V1_CR0,1,1517,853_AL_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        tvShow.add(
            Movies(
                "T7",
                "The Last Kingdom",
                "Action, Drama, History",
                "8.4",
                "UK",
                "The year is 872, and many of the separate kingdoms of what we now know as England have fallen to the invading Danes, leaving the great kingdom of Wessex standing alone and defiant under the command of King Alfred. Against this turbulent backdrop lives our hero, Uhtred. Born the son of a Saxon nobleman, he is captured by the Danes and raised as one of their own. Forced to choose between the country of his birth and the people of his upbringing, his loyalties are ever tested. What is he? Saxon or Dane? On a quest to reclaim his birthright, Uhtred must tread a dangerous path between both sides if he is to play his part in the birth of a new nation and, ultimately, recapture his ancestral lands.",
                "Bernard Cornwell, Stephen Butchard",
                "England is Born",
                "Alexander Dreymon, Eliza Butterworth, Ian Hart",
                "https://m.media-amazon.com/images/M/MV5BMjE1MzYzNjk3OF5BMl5BanBnXkFtZTgwMzk0MzYwNzE@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BYjAxMzVmNmUtYmIyZC00MjhlLWFiZDAtYzMxZWJjZGVjYjg4XkEyXkFqcGdeQWFybm8@._V1_CR0,18,1399,787_AL_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        tvShow.add(
            Movies(
                "T8",
                "The Mandalorian",
                "Action, Adventure, Sci-Fi",
                "8.7",
                "USA",
                "After the stories of Jango and Boba Fett, another warrior emerges in the Star Wars universe. The Mandalorian is set after the fall of the Empire and before the emergence of the First Order. We follow the travails of a lone gunfighter in the outer reaches of the galaxy far from the authority of the New Republic.",
                "Jon Favreau",
                "-",
                "Pedro Pascal, Carl Weathers, Rio Hackford",
                "https://m.media-amazon.com/images/M/MV5BMWI0OTJlYTItNzMwZi00YzRiLWJhMjItMWRlMDNhZjNiMzJkXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BYmYyMTFiODEtMDg2OS00Y2M5LWFkNzUtNjVmMjVlNDI5Yzg0XkEyXkFqcGdeQW1hcmNtYW5u._V1_CR1,0,1248,702_AL_UY268_CR0,0,477,268_AL_.jpg"
            )
        )

        tvShow.add(
            Movies(
                "T9",
                "NCIS",
                "Action, Crime, Drama",
                "7.8",
                "USA",
                "Special Agent Leroy Jethro Gibbs is the leader of a team of special agents belonging to the NCIS (Naval Criminal Investigative Service) Major Case Response Team. Gibbs, a former Marine, is a tough investigator and a highly skilled interrogator who relies on his gut instinct as much as evidence. Gibbs' second in command is Senior Field Agent Tony DiNozzo, a womanizing, movie-quoting former Baltimore Homicide Detective, who despite being the class clown always gets the job done. The team also consists of probationary field agent Eleanor Bishop, a former NSA agent, as well as Junior Field Agent Timothy McGee, a computer-savvy agent often mocked by DiNozzo.",
                "Donald P. Bellisario, Don McGill",
                "-",
                "Mark Harmon, David McCallum, Sean Murray",
                "https://m.media-amazon.com/images/M/MV5BYjVlMjZhYzYtOGQxNC00OTQxLTk2NzEtMWFmMmNhODA4YjYzXkEyXkFqcGdeQXVyNjQ3MDgwNjY@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BZDJiZmZiNGUtNWFhMi00MzM0LWEzMjAtMTM2NzMyYzQzMjg5XkEyXkFqcGdeQXVyNzU1NzE3NTg@._V1_CR0,45,480,270_AL_UX477_CR0,0,477,268_AL_.jpg"
            )
        )

        tvShow.add(
            Movies(
                "T10",
                "The Witcher",
                "Action, Adventure, Fantasy",
                "8.2",
                "USA, Poland",
                "The Witcher is an American fantasy drama web television series created by Lauren Schmidt Hissrich for Netflix. It is based on the book series of the same name by Polish writer Andrzej Sapkowski. The Witcher follows the story of Geralt of Rivia, a solitary monster hunter, who struggles to find his place in a world where people often prove more wicked than monsters and beasts. But when destiny hurtles him toward a powerful sorceress, and a young princess with a special gift, the three must learn to navigate independently the increasingly volatile Continent.",
                "Lauren Schmidt",
                "My world is cruel and predictable. You enter, you survive, you die.",
                "Henry Cavill, Freya Allan, Anya Chalotra",
                "https://m.media-amazon.com/images/M/MV5BOGE4MmVjMDgtMzIzYy00NjEwLWJlODMtMDI1MGY2ZDlhMzE2XkEyXkFqcGdeQXVyMzY0MTE3NzU@._V1_UX182_CR0,0,182,268_AL_.jpg",
                "https://m.media-amazon.com/images/M/MV5BYjhmYWZhNzctNTI3NS00OTNlLTlmNWItNTU4OWI3NGI3OGRmXkEyXkFqcGdeQWpnYW1i._V1_CR1,0,1248,702_AL_UY268_CR0,0,477,268_AL_.jpg"
            )
        )

        return tvShow
    }
}