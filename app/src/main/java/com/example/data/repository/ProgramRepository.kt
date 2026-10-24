package com.example.data.repository

import com.example.data.model.WorkoutDay
import com.example.data.model.WorkoutProgram

object ProgramRepository {

    val weeklyPrograms: List<WorkoutProgram> = listOf(
        WorkoutProgram(
            id = "prog_abatangura",
            izina = "Porogaramu y'Abatangura (Imisi 3 mu Ndwi)",
            urwego = "Abatangura",
            ubusobanuro = "Gahunda yateguwe by'umwihariko ku bantu bashya cyangwa abamaze igihe badakora siporo. Yubaka umusezero ukomeye nta mvune.",
            igiheKuNdwi = "Imisi 3 mu ndwi (Iminota 25 - 30 ku munsi)",
            iminsi = listOf(
                WorkoutDay(
                    umusi = "Ku wa Mbere: Imbaraga z'Igikiriza n'Amaguru",
                    intego = "Gukangura imitsi minini y'umubiri",
                    imyitozo = listOf(
                        "Kwinyugura: Jumping jacks (amasegonda 60)",
                        "Pompe zoroheje ku mavi (Inshuro 10 x 3)",
                        "Squat isanzwe (Inshuro 12 x 3)",
                        "Glute Bridge yo hasi (Inshuro 15 x 3)",
                        "Kurambara inkomezi - Plank (amasegonda 30 x 3)",
                        "Kuruhuka: Child's Pose (amasegonda 60)"
                    ),
                    igihe = "Iminota 25"
                ),
                WorkoutDay(
                    umusi = "Ku wa Kabiri: Kuruhuka no Kunywa Amazi",
                    intego = "Kureka imitsi yisane kandi yubake inguvu nshya",
                    imyitozo = listOf(
                        "Kugenda n'amaguru buhoro iminota 20",
                        "Kunywa ibirahure 8 by'amazi meza",
                        "Kurambura ijosi n'ibitugu buhoro"
                    ),
                    igihe = "Iminota 15"
                ),
                WorkoutDay(
                    umusi = "Ku wa Gatatu: Inda n'Umubiri wose",
                    intego = "Gukomeza igihimba n'ubushobozi bwo guhumeka",
                    imyitozo = listOf(
                        "Kwinyugura: Kwegura amavi hejuru (amasegonda 45)",
                        "Crunch yo hasi (Inshuro 15 x 3)",
                        "Bird Dog yo ku mugongo (Inshuro 10 kuri buri ruhande x 3)",
                        "Kwicara ku ruhome - Wall Sit (amasegonda 30 x 3)",
                        "Superman ku mugongo (Inshuro 10 x 3)",
                        "Kwigorora k'inzoka - Cobra Stretch (amasegonda 45)"
                    ),
                    igihe = "Iminota 25"
                ),
                WorkoutDay(
                    umusi = "Ku wa Kane: Umusi wo Kuruhuka",
                    intego = "Kuruhuka no gufata amafunguro akize ku mboga n'ibiharage",
                    imyitozo = listOf(
                        "Kuruhura umubiri",
                        "Gusinzira amasaha 8 y'itiro ryiza"
                    ),
                    igihe = "Umunsi w'uburuhukiro"
                ),
                WorkoutDay(
                    umusi = "Ku wa Gatanu: Kwihuta no Gutwika Ibinure",
                    intego = "Gusoza indwi umubiri ushyushye kandi ufite ubuzima",
                    imyitozo = listOf(
                        "Kwinyugura: Kuzunguza inyonga n'amaboko",
                        "Fentes z'inyuma (Inshuro 10 kuri buri kuguru x 3)",
                        "Dips ku ntebe (Inshuro 10 x 3)",
                        "Kurira umusozi hasi - Mountain Climbers (amasegonda 30 x 3)",
                        "Guhagarara ku manono (Inshuro 20 x 3)",
                        "Kuruhuka nk'umwana no gushimira umubiri"
                    ),
                    igihe = "Iminota 30"
                ),
                WorkoutDay(
                    umusi = "Mu Mpera z'Indwi (Ku wa Gatandatu & Ku Cyumweru)",
                    intego = "Ubusabane n'umuryango, gutembera no koga",
                    imyitozo = listOf(
                        "Kugendagenda mu mazi y'ikiyaga cyangwa mu misozi",
                        "Gufungura ifunguro ry'indagara na mukeke mu rugo",
                        "Kuryama ku gihe cyiza"
                    ),
                    igihe = "Igihe kirekire"
                )
            )
        ),
        WorkoutProgram(
            id = "prog_abamenyereye",
            izina = "Porogaramu y'Abamenyereye (Imisi 5 mu Ndwi)",
            urwego = "Abamenyereye",
            ubusobanuro = "Gahunda ikaze cyane y'abantu bamaze kumenyera imyitozo, bashaka inguvu zidasanzwe, imitsi iteye amabengeza n'umuvuduko.",
            igiheKuNdwi = "Imisi 5 mu ndwi (Iminota 40 - 45 ku munsi)",
            iminsi = listOf(
                WorkoutDay(
                    umusi = "Ku wa Mbere: Igikiriza n'Amaboko (Push Day)",
                    intego = "Kwagura igikiriza no kubaka amaboko akomeye",
                    imyitozo = listOf(
                        "Pompe zisanzwe (Inshuro 15 x 4)",
                        "Pompe z'intoki zifatanije - Diamond (Inshuro 12 x 3)",
                        "Pike push-ups z'ibitugu (Inshuro 10 x 3)",
                        "Dips ku ntebe (Inshuro 15 x 3)",
                        "Plank Shoulder taps (Inshuro 20 x 3)"
                    ),
                    igihe = "Iminota 40"
                ),
                WorkoutDay(
                    umusi = "Ku wa Kabiri: Amaguru n'Ikibuno (Legs Power)",
                    intego = "Kubaka amaguru y'icyuma",
                    imyitozo = listOf(
                        "Squat yo gusimbuka - Jump Squats (Inshuro 15 x 4)",
                        "Squat ya Sumo (Inshuro 18 x 3)",
                        "Fentes z'imbere (Inshuro 12 kuri buri kuguru x 3)",
                        "Glute bridge y'ukuguru kumwe (Inshuro 10 kuri buri kuguru x 3)",
                        "Wall sit (Amasegonda 60 x 3)"
                    ),
                    igihe = "Iminota 45"
                ),
                WorkoutDay(
                    umusi = "Ku wa Gatatu: Inda n'Umugongo (Core & Back)",
                    intego = "Kubaka inda y'amabuye (six-pack) n'umugongo ugororotse",
                    imyitozo = listOf(
                        "Gutwara igare ku nda - Bicycle crunch (Inshuro 25 x 3)",
                        "Kuzamura amaguru hasi - Leg raises (Inshuro 15 x 3)",
                        "Russian twist (Inshuro 24 x 3)",
                        "Hollow body hold (Amasegonda 30 x 3)",
                        "Superman hold (Amasegonda 40 x 3)"
                    ),
                    igihe = "Iminota 35"
                ),
                WorkoutDay(
                    umusi = "Ku wa Kane: Kuruhuka gukora (Active Recovery)",
                    intego = "Kwiruka buhoro no kurambura imitsi yose",
                    imyitozo = listOf(
                        "Jogging buhoro ku muhanda cyangwa mu rugo (Iminota 25)",
                        "Cobra stretch na Hamstring stretch yose (Iminota 15)",
                        "Kunywa amazi menshi"
                    ),
                    igihe = "Iminota 40"
                ),
                WorkoutDay(
                    umusi = "Ku wa Gatanu: Umubiri wose & HIIT Inferno",
                    intego = "Gutwika ibinure byose n'ubushyuhe bukabije",
                    imyitozo = listOf(
                        "Burpees zikomeye (Inshuro 12 x 4)",
                        "Mountain climbers (Amasegonda 45 x 4)",
                        "High knees (Amasegonda 45 x 3)",
                        "Bear crawl (Intambwe 20 imbere n'inyuma x 3)",
                        "High plank to low plank (Inshuro 12 x 3)"
                    ),
                    igihe = "Iminota 45"
                )
            )
        ),
        WorkoutProgram(
            id = "prog_kugabanya_ibinure",
            izina = "Porogaramu yo Kugabanya Ibinure (Cardio & Fat Burning)",
            urwego = "Kugabanya Ibinure",
            ubusobanuro = "Gahunda yihariye yo gutwika ibinure mu nda no mu mbavu, ikoresheje umuvuduko n'imyitozo ituma umutima ukora cyane.",
            igiheKuNdwi = "Imisi 4 mu ndwi (Iminota 30 ku munsi)",
            iminsi = listOf(
                WorkoutDay(
                    umusi = "Ku wa Mbere: Cardio Blast",
                    intego = "Gukangura umutima no gutangiza gutwika ibinure",
                    imyitozo = listOf(
                        "Jumping jacks (Amasegonda 60 x 3)",
                        "High knees (Amasegonda 45 x 3)",
                        "Mountain climbers (Amasegonda 45 x 3)",
                        "Shadow boxing (Iminota 2 x 3)"
                    ),
                    igihe = "Iminota 30"
                ),
                WorkoutDay(
                    umusi = "Ku wa Gatatu: Inda n'Imbavu",
                    intego = "Gukuraho amavuta yo ku mbavu no mu nda yo hasi",
                    imyitozo = listOf(
                        "Bicycle crunch (Inshuro 20 x 4)",
                        "Side plank (Amasegonda 30 kuri buri ruhande x 3)",
                        "Russian twist (Inshuro 20 x 3)",
                        "Flutter kicks (Amasegonda 30 x 3)"
                    ),
                    igihe = "Iminota 30"
                ),
                WorkoutDay(
                    umusi = "Ku wa Gatanu: Full Body Burn",
                    intego = "Guhwitura umubiri wose",
                    imyitozo = listOf(
                        "Burpees zoroheje (Inshuro 10 x 4)",
                        "Skater hops (Inshuro 20 x 3)",
                        "Squat yo gusimbuka (Inshuro 12 x 3)",
                        "Plank isanzwe (Amasegonda 45 x 3)"
                    ),
                    igihe = "Iminota 30"
                ),
                WorkoutDay(
                    umusi = "Ku wa Gatandatu: Kwiruka mu kirere cyiza",
                    intego = "Kwiruka hanze ku musozi cyangwa ku kiyaga",
                    imyitozo = listOf(
                        "Kwiruka intera ya kilometero 3 kugeza kuri 5 buhoro",
                        "Kurambura imitsi nyuma yo kwiruka"
                    ),
                    igihe = "Iminota 35"
                )
            )
        )
    )
}
