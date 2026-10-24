package com.example.data.repository

import com.example.data.model.Exercise

object ExerciseRepository {

    val allExercises: List<Exercise> = listOf(
        Exercise(
            id = 1,
            izina = "Pompe zoroheje ku mavi (Knee Push-ups)",
            urwego = "Abatangura",
            umugwi = "Igikiriza",
            inshuro = "Inshuro 10 - 12 (Imirwi 3)",
            ubusobanuro = "Umwitozo mwiza cyane wo gutangura wubaka inguvu z'igikiriza, amaboko n'ibitugu utavunika amavi.",
            intambwe = listOf(
                "Shira amavi hasi ku mukeka cyangwa hasi ahatekanye.",
                "Shinga amaboko hasi ku bugari bungana n'ibitugu.",
                "Komeza umubiri ugororoke kuva mu mutwe kugera mu mavi.",
                "Manura igikiriza hafi y'ubutaka unyeganyeza amakokora ku mpande.",
                "Sukumira hejuru ukoresheje igikiriza n'amaboko usubire aho watanguriye."
            ),
            umutekano = "Ntugapfunye umugongo cyangwa ngo ushike ikibuno hejuru cyane. Humeka neza: manuka uhumeka, zamuka uhumeka.",
            inamaYaMarcel = "Kora buhoro buhoro kandi ukomeze umubiri. Nta gushaka kwihuta igihe utaratunganya umwitozo neza!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 2,
            izina = "Pompe zisanzwe (Standard Push-ups)",
            urwego = "Abageze hagati",
            umugwi = "Igikiriza",
            inshuro = "Inshuro 12 - 15 (Imirwi 3)",
            ubusobanuro = "Umwitozo nyamukuru ukomeza igikiriza, amaboko (triceps) n'inkomezi z'inda.",
            intambwe = listOf(
                "Shinga ibirenge n'amaboko hasi, umubiri ugororotse neza nk'igiti.",
                "Amaboko agororotse munsi y'ibitugu.",
                "Manura igikiriza kugeza gisigaye intambwe nto cyane hejuru y'ubutaka.",
                "Sukuma umubiri wose hejuru icyarimwe ukoresheje imitsi y'igikiriza."
            ),
            umutekano = "Komeza umutwe uhangame n'umugongo. Nturenze amakokora kure y'umubiri ku buryo akora inguni ya dogere 45.",
            inamaYaMarcel = "Iyo unaniwe, ntukareke gukora burundu; kora zoroheje ku mavi aho guhagarara!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 3,
            izina = "Pompe z'intoki zifatanije (Diamond Push-ups)",
            urwego = "Abamenyereye",
            umugwi = "Amaboko",
            inshuro = "Inshuro 8 - 12 (Imirwi 3)",
            ubusobanuro = "Itezimbere imitsi y'inyuma y'amaboko (triceps) n'igikiriza hagati mu buryo bukomeye.",
            intambwe = listOf(
                "Gira nk'ugiye gukora pompe, hanyuma ufatanye intoki zawe hasi zikoze ishusho ya diamant cyangwa mpandeshatu.",
                "Komeza umubiri ugororotse.",
                "Manura igikiriza ku ntoki zawe buhoro buhoro.",
                "Sukuma umubiri hejuru ukoresheje inyuma y'amaboko yawe."
            ),
            umutekano = "Niba wumva ububabare mu bukokora, gabanya uburemere cyangwa ubikore uhebye kugeza amaboko akomeye.",
            inamaYaMarcel = "Uyu mwitozo utera amaboko gukomera no kugira imitsi iboneka neza!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 4,
            izina = "Pompe z'amaboko yagutse (Wide Push-ups)",
            urwego = "Abageze hagati",
            umugwi = "Igikiriza",
            inshuro = "Inshuro 10 - 15 (Imirwi 3)",
            ubusobanuro = "Yagura igikiriza igakomeza imitsi yo ku mpande y'ibituza.",
            intambwe = listOf(
                "Shinga amaboko hasi urenza ubugari bw'ibitugu intambwe imwe.",
                "Manura igikiriza hasi wumva imitsi y'igikiriza irambuka neza.",
                "Sukuma wazamuka ukomeza gukanyaga igikiriza."
            ),
            umutekano = "Irinde kumanuka vuba cyane kugira ngo udakomeretsa intugu.",
            inamaYaMarcel = "Iyo wamaze kwiga uyu mwitozo, igikiriza cyawe kiba kigari kandi giteye amabengeza.",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 5,
            izina = "Pompe z'amaguru ari hejuru (Decline Push-ups)",
            urwego = "Abamenyereye",
            umugwi = "Igikiriza",
            inshuro = "Inshuro 8 - 12 (Imirwi 3)",
            ubusobanuro = "Yibanda cyane ku gice cyo hejuru cy'igikiriza no ku bitugu.",
            intambwe = listOf(
                "Shira ibirenge hejuru y'intebe cyangwa ibuye rikomeye.",
                "Shinga amaboko hasi ku butaka.",
                "Manura umutwe n'igikiriza hasi buhoro.",
                "Sukumira hejuru umubiri ugororotse."
            ),
            umutekano = "Komeza inda ikanyagiye kugira umugongo udacika igipande.",
            inamaYaMarcel = "Ni umwitozo w'abantu bashaka ubukaka bwo hejuru!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 6,
            izina = "Squat isanzwe (Air Squats)",
            urwego = "Abatangura",
            umugwi = "Amaguru",
            inshuro = "Inshuro 15 - 20 (Imirwi 4)",
            ubusobanuro = "Umwitozo ukomeye cyane wubaka amaguru yose, ikibuno, amavi n'amatako.",
            intambwe = listOf(
                "Hagarara ugororotse, ibirenge bingana n'ubugari bw'ibitugu.",
                "Manuka nk'ugiye kwicara ku ntebe iri inyuma yawe.",
                "Komeza igikiriza kireba hejuru n'umugongo ugororotse.",
                "Iyo amatako ageze ku murongo ubangikanye n'ubutaka, haguruka usukuma ku bitsinsino."
            ),
            umutekano = "Amavi ntakwiye kurenga imitwe y'amano imbere. Irinde guhina umugongo.",
            inamaYaMarcel = "Squat ni umwami w'imyitozo y'amaguru. Ntiwigere uyisimbuka mu ndwi!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 7,
            izina = "Squat yo gusimbuka (Jump Squats)",
            urwego = "Abamenyereye",
            umugwi = "Amaguru",
            inshuro = "Inshuro 12 - 15 (Imirwi 3)",
            ubusobanuro = "Yongera umuvuduko, inguvu z'amaguru igatwika ibinure byihuse cyane.",
            intambwe = listOf(
                "Manuka muri squat isanzwe.",
                "Ugeze hasi, sukuma n'imbaraga nyinshi usimbukira mu kirere.",
                "Gwa hasi buhoro unyeganyeza amavi kugira amagufwa atababara, uhite usubira muri squat."
            ),
            umutekano = "Gwa ku manono mbere y'ibitsinsino kugira ngo amavi atanyeganyega nabi.",
            inamaYaMarcel = "Iyo ushaka kugira umuvuduko mu kwiruka no gusimbuka hejuru, uyu ni wo muti!",
            ubwoko = "Kugabanya Ibinure"
        ),
        Exercise(
            id = 8,
            izina = "Squat ya Sumo (Sumo Squats)",
            urwego = "Abageze hagati",
            umugwi = "Amaguru",
            inshuro = "Inshuro 15 (Imirwi 3)",
            ubusobanuro = "Iteza imbere imitsi yo hagati y'amatako (adducteurs) n'ikibuno.",
            intambwe = listOf(
                "Hagarara waguye ibirenge cyane kurenza ibitugu, intoki z'ibirenge zireba hanze.",
                "Manuka ugororotse igikiriza kiri hejuru.",
                "Haguruka usukuma ku bitsinsino ukanyaga ikibuno hejuru."
            ),
            umutekano = "Komeza amavi yerekeza aho amano y'ibirenge yerekeje.",
            inamaYaMarcel = "Ifasha cyane kurinda imvune zo mu mayunguyungu n'amatako.",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 9,
            izina = "Kwicara ku ruhome (Wall Sit)",
            urwego = "Abatangura",
            umugwi = "Amaguru",
            inshuro = "Amasegonda 30 - 60 (Imirwi 3)",
            ubusobanuro = "Umwitozo udasaba kunyeganyega ariko ukomeza amavi n'amatako bikomeye cyane.",
            intambwe = listOf(
                "Egama umugongo wose ku ruhome cyangwa ku rukuta rukomeye.",
                "Genda unyerera kugeza amaguru akoze inguni ya dogere 90 nk'wicaye ku ntebe.",
                "Komeza amaboko ku mpande cyangwa imbere, ntugafate ku mavi.",
                "Komeza guhumeka ushikame muri uwo mwanya."
            ),
            umutekano = "Ibirenge bibe biteganye hasi, amavi atajya imbere y'amano.",
            inamaYaMarcel = "N'ubwo udasimbuka, amatako aza kwaka umuriro! Komeza uhumeke, amagara ari muri uwo muriro!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 10,
            izina = "Fentes z'imbere (Forward Lunges)",
            urwego = "Abageze hagati",
            umugwi = "Amaguru",
            inshuro = "Inshuro 10 kuri buri kuguru (Imirwi 3)",
            ubusobanuro = "Yubaka kuringaniza umubiri (équilibre) igakomeza amatako n'ikibuno kuri buri ruhande.",
            intambwe = listOf(
                "Hagarara ugororotse intoki ku mayunguyungu.",
                "Tera intambwe nini imbere n'ukuguru kw'iburyo.",
                "Pfunya amavi yombi kugeza ivi ry'inyuma ryegereye ubutaka.",
                "Sukuma ku kirenge cy'imbere usubire aho watanguriye, uhindure ukundi kuguru."
            ),
            umutekano = "Irinde kureka ivi ry'imbere rikarenga amano.",
            inamaYaMarcel = "Uyu mwitozo utunganya ingendo igororotse n'imitsi ikomeye y'ibibero.",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 11,
            izina = "Fentes z'inyuma (Reverse Lunges)",
            urwego = "Abatangura",
            umugwi = "Amaguru",
            inshuro = "Inshuro 12 kuri buri kuguru (Imirwi 3)",
            ubusobanuro = "Yoroheye amavi kurenza iya mbere ariko ikora ku bibuno n'amatako neza cyane.",
            intambwe = listOf(
                "Hagarara wemye.",
                "Tera intambwe nini inyuma n'ukuguru kumwe.",
                "Manuka kugeza amavi agize inguni igororotse.",
                "Haguruka ukoresheje imbaraga z'ukuguru kw'imbere."
            ),
            umutekano = "Komeza umutwe n'igikiriza biteganye hejuru.",
            inamaYaMarcel = "Niba ufite intege nke mu mavi, tangurira kuri iyi fente y'inyuma!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 12,
            izina = "Fentes z'uruhande (Side Lunges)",
            urwego = "Abageze hagati",
            umugwi = "Amaguru",
            inshuro = "Inshuro 10 kuri buri ruhande (Imirwi 3)",
            ubusobanuro = "Irambura kandi igakomeza imitsi y'impande z'amatako n'amayunguyungu.",
            intambwe = listOf(
                "Hagarara ugororotse, tera intambwe nini cyane ku ruhande rw'iburyo.",
                "Pfunya ivi ry'iburyo wicara inyuma, ukuguru kw'ibumoso kugume kugororotse.",
                "Sukuma usubire hagati, hanyuma ukore ku rundi ruhande."
            ),
            umutekano = "Guma ushyize ibirenge byombi biteganye imbere.",
            inamaYaMarcel = "Ni ingirakamaro cyane ku bantu bakina umupira w'amaguru n'abiruka!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 13,
            izina = "Kurambara inkomezi hasi (Plank / Gainage)",
            urwego = "Abatangura",
            umugwi = "Inda",
            inshuro = "Amasegonda 30 - 60 (Imirwi 3)",
            ubusobanuro = "Umwitozo nyamukuru ukomeza inda yose, umugongo wo hasi n'umubiri wose nta kwiruka.",
            intambwe = listOf(
                "Shinga amakokora n'amano y'ibirenge hasi.",
                "Komeza umubiri ugororotse ku murongo umwe nk'urubaho kuva mu mutwe kugera ku birenge.",
                "Kanya imitsi y'inda n'ikibuno wumve bikomeye.",
                "Komeza guhumeka buhoro buhoro utareka umwuka."
            ),
            umutekano = "Ntukamanure ikibuno cyane ngo umugongo uhinike, kandi ntugashyire ikibuno hejuru nk'umusozi.",
            inamaYaMarcel = "Amasogonda 30 ya mbere arasa n'ayoroshye, ariko ubuhatsi bwawe burageragezwa! Komeza ushikame!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 14,
            izina = "Kurambara inkomezi ku rumbavu (Side Plank)",
            urwego = "Abageze hagati",
            umugwi = "Inda",
            inshuro = "Amasegonda 30 kuri buri ruhande (Imirwi 3)",
            ubusobanuro = "Ikomeza imitsi yo ku mbavu (obliques) n'umugongo ifasha kugabanya umubyimba wo ku mayunguyungu.",
            intambwe = listOf(
                "Rambarara ku ruhande rw'iburyo, ushinge inkokora y'iburyo hasi munsi y'igitugu.",
                "Shira ukuguru kw'ibumoso hejuru y'ukw'iburyo.",
                "Zamura ikibuno hejuru umubiri ugororoke ku murongo umwe.",
                "Fata uwo mwanya ukomeje guhumeka."
            ),
            umutekano = "Irinde kureka ikibuno ngo kigwe hasi; guma ugisunitse hejuru.",
            inamaYaMarcel = "Iyo ugize imbavu zikomeye, ntiwongera kubabara umugongo!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 15,
            izina = "Gukora ku bitugu muri plank (Plank Shoulder Taps)",
            urwego = "Abageze hagati",
            umugwi = "Inda",
            inshuro = "Inshuro 20 muri rusange (Imirwi 3)",
            ubusobanuro = "Yongera ubushobozi bwo guhagarika umubiri no gukomeza inda n'ibitugu.",
            intambwe = listOf(
                "Hagarara mu mwanya wa pompe amaboko agororotse.",
                "Yagura ibirenge gato kugira ngo ubone uburyo bwo gushikama.",
                "Zamura ukuboko kw'iburyo ukore ku gitugu cy'ibumoso utanyeganyije ikibuno.",
                "Garura ukuboko hasi, ukore n'ukuboko kw'ibumoso ku gitugu cy'iburyo."
            ),
            umutekano = "Gerageza kureka ikibuno kidacugusa cyane iburyo n'ibumoso.",
            inamaYaMarcel = "Kora nk'aho ufite ikirahure cy'amazi ku mugongo kidakwiye kumeneka!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 16,
            izina = "Crunch yo hasi (Abdominal Crunch)",
            urwego = "Abatangura",
            umugwi = "Inda",
            inshuro = "Inshuro 15 - 20 (Imirwi 3)",
            ubusobanuro = "Umwitozo w'ibanze ukora ku mitsi yo hejuru y'inda (six-pack).",
            intambwe = listOf(
                "Rambarara ugaramye hasi, upfunye amavi ibirenge birambitse hasi.",
                "Shira intoki inyuma y'amatwi cyangwa ku gikiriza, ntugakuruze ijosi.",
                "Zamura igice cyo hejuru cy'umugongo ukoresheje imitsi y'inda.",
                "Manuka buhoro buhoro usubire hasi."
            ),
            umutekano = "Irinde gukurura ijosi n'intoki; imitsi y'inda niyo ikora akazi kose.",
            inamaYaMarcel = "Humeka usohora umwuka igihe uzamutse hejuru wumve inda ikanyagiye!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 17,
            izina = "Gutwara igare ku nda (Bicycle Crunch)",
            urwego = "Abageze hagati",
            umugwi = "Inda",
            inshuro = "Inshuro 20 muri rusange (Imirwi 3)",
            ubusobanuro = "Umwe mu myitozo ya mbere ifite inguvu zo gukomeza inda yose n'imbavu.",
            intambwe = listOf(
                "Rambarara ugaramye, zamura amavi hejuru.",
                "Shira intoki inyuma y'umutwe.",
                "Zana inkokora y'iburyo ku ivi ry'ibumoso urambura ukuguru kw'iburyo imbere.",
                "Hinduranya uhite uzana inkokora y'ibumoso ku ivi ry'iburyo nk'utwara igare."
            ),
            umutekano = "Ntugapfunyishe umuvuduko ukabije; kora buhoro wumve imitsi ikora.",
            inamaYaMarcel = "Iyo ukoze ibi inshuro 20 ugira ngo uri mu musozi wa Bugarama ku igare! Komeza!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 18,
            izina = "Kuzamura amaguru hasi (Leg Raises)",
            urwego = "Abageze hagati",
            umugwi = "Inda",
            inshuro = "Inshuro 12 - 15 (Imirwi 3)",
            ubusobanuro = "Itezimbere imitsi yo hasi y'inda igafasha kugabanya umubyimba wo mu nda yo hasi.",
            intambwe = listOf(
                "Rambarara ugaramye hasi, amaboko arambitse iruhande rw'ikibuno.",
                "Komeza amaguru agororotse.",
                "Yazamure hejuru yose icyarimwe kugeza akoze inguni ya dogere 90.",
                "Yamanure buhoro buhoro hasi ariko ntagakore hasi burundu mbere yo kongera kuyazamura."
            ),
            umutekano = "Komeza umugongo wo hasi ukanyagiye ku butaka utazamuka hejuru.",
            inamaYaMarcel = "Niba biruhije cyane, pfunya amavi gato kugeza igihe uzagirira inguvu.",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 19,
            izina = "Russian Twist (Guhindukiza umubiri)",
            urwego = "Abageze hagati",
            umugwi = "Inda",
            inshuro = "Inshuro 20 (10 kuri buri ruhande) (Imirwi 3)",
            ubusobanuro = "Ikomeza imbavu n'amayunguyungu igatera igihimba kuringanira neza.",
            intambwe = listOf(
                "Icaye hasi upfunye amavi gato, hanyuma egama inyuma gato umubiri ukoze inyuguti ya V.",
                "Zamura ibirenge hejuru y'ubutaka intambwe nto (cyangwa ubigumishe hasi niba utangiye).",
                "Hindukiza amaboko n'igikiriza cyose iburyo ukore hasi, hanyuma wihindukize ibumoso ukore hasi."
            ),
            umutekano = "Hindukiza igikiriza cyose ntabwo ari amaboko gusa.",
            inamaYaMarcel = "Ni umwitozo mwiza cyane wo gukuraho ibinure byo mu mbavu!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 20,
            izina = "Kurira umusozi hasi (Mountain Climbers)",
            urwego = "Abatangura",
            umugwi = "Cardio",
            inshuro = "Amasegonda 30 - 45 (Imirwi 3)",
            ubusobanuro = "Umwitozo wihuse cyane utera umutima gutera neza, ugatwika ibinure ukagora inda n'amaguru.",
            intambwe = listOf(
                "Shinga amaboko hasi nk'ugiye gukora pompe.",
                "Zana ivi ry'iburyo imbere ku gikiriza mu muvuduko wihuse.",
                "Risubize inyuma uhite uzana ivi ry'ibumoso.",
                "Komeza guhinduranya nka we wiruka wihuta cyane."
            ),
            umutekano = "Guma ushyize amaboko munsi y'ibitugu, kandi ikibuno ntikizenguruke cyane hejuru.",
            inamaYaMarcel = "Uyu mwitozo utuma ututubikana mu masegonda 30 gusa! Amagara imbere ya vyose!",
            ubwoko = "Kugabanya Ibinure"
        ),
        Exercise(
            id = 21,
            izina = "Burpees zoroheje (Beginner Burpees)",
            urwego = "Abatangura",
            umugwi = "Umubiri wose",
            inshuro = "Inshuro 8 - 10 (Imirwi 3)",
            ubusobanuro = "Itezimbere umubiri wose nta gusimbuka gukabije, yorohereza abatangura.",
            intambwe = listOf(
                "Hagarara ugororotse.",
                "Pfunya amavi ushinge amaboko hasi imbere yawe.",
                "Tera intambwe inyuma n'ukuguru kumwe hanyuma n'ukundi mu mwanya wa pompe.",
                "Garura amaguru imbere intambwe ku yindi.",
                "Haguruka wemye uzamure amaboko hejuru."
            ),
            umutekano = "Komeza umugongo ugororotse igihe ufashe hasi.",
            inamaYaMarcel = "Burpees ituma umubiri wose ukora icyarimwe: amaguru, inda, igikiriza n'amaboko!",
            ubwoko = "Kugabanya Ibinure"
        ),
        Exercise(
            id = 22,
            izina = "Burpees zikomeye (Full Burpees)",
            urwego = "Abamenyereye",
            umugwi = "Umubiri wose",
            inshuro = "Inshuro 10 - 15 (Imirwi 3)",
            ubusobanuro = "Umwitozo ukaze cyane watuma umuntu agira inguvu n'ubushobozi burenze.",
            intambwe = listOf(
                "Hagarara wemye, manuka vuba ushinge amaboko hasi.",
                "Simbukana amaguru yombi inyuma mu mwanya wa pompe.",
                "Kora pompe imwe igikiriza gikore hasi.",
                "Simbukana amaguru imbere hafi y'amaboko.",
                "Simbukira hejuru mu kirere n'imbaraga ukoma amashyi hejuru y'umutwe."
            ),
            umutekano = "Irinde kumanuka nabi ku mavi igihe usimbutse hejuru.",
            inamaYaMarcel = "Ukoze burpees 50 ku munsi, nta kinure cyagutindaho na kimwe!",
            ubwoko = "Kugabanya Ibinure"
        ),
        Exercise(
            id = 23,
            izina = "Jumping Jacks (Gusimbuka uhambagiza)",
            urwego = "Abatangura",
            umugwi = "Cardio",
            inshuro = "Amasegonda 45 - 60 (Imirwi 3)",
            ubusobanuro = "Umwitozo wo kwinyugura n'uw'ingenzi mu kongera umuvuduko w'amaraso n'uguhumeka neza.",
            intambwe = listOf(
                "Hagarara wemye ibirenge bifatanye n'amaboko ku mpande.",
                "Simbuka wagure amaguru ku mpande icyarimwe n'amaboko azamuka hejuru agakorana hejuru y'umutwe.",
                "Simbuka usubire mu mwanya wa mbere ibirenge bifatanye.",
                "Komeza mu muvuduko uhoraho."
            ),
            umutekano = "Gwa hasi buhoro ku manono y'ibirenge kugira wirinde gukomeretsa udutsinsino.",
            inamaYaMarcel = "Ni umwitozo mwiza wo gutangiriraho imyitozo yawe yose ya buri munsi!",
            ubwoko = "Kwinyugura"
        ),
        Exercise(
            id = 24,
            izina = "Kwegura amavi hejuru (High Knees)",
            urwego = "Abatangura",
            umugwi = "Cardio",
            inshuro = "Amasegonda 30 - 45 (Imirwi 3)",
            ubusobanuro = "Kwirukira aho uhagaze uzamura amavi hejuru cyane, igatwika amavuta mu nda.",
            intambwe = listOf(
                "Hagarara ugororotse.",
                "Tangira kwiruka aho uhagaze uzamura ivi ry'iburyo hejuru kugeza ringaniye n'ikibuno.",
                "Hinduranya uzamura n'ivi ry'ibumoso mu muvuduko wo hejuru.",
                "Gira amaboko nka we wiruka mu masiganwa."
            ),
            umutekano = "Komeza igikiriza cyerekeza hejuru ntugahebe umugongo inyuma.",
            inamaYaMarcel = "Komeza umutima utere neza, umwuka winjire mu bihaha byose!",
            ubwoko = "Kugabanya Ibinure"
        ),
        Exercise(
            id = 25,
            izina = "Gutera ibirenge inyuma (Butt Kicks)",
            urwego = "Abatangura",
            umugwi = "Cardio",
            inshuro = "Amasegonda 30 - 45 (Imirwi 3)",
            ubusobanuro = "Yongera umuvuduko w'amaguru igategura amatako n'amavi kwiruka.",
            intambwe = listOf(
                "Hagarara wemye.",
                "Iruke aho uhagaze uzamura ibitsinsino by'ibirenge bikore ku bibuno.",
                "Komeza guhinduranya ibirenge byihuse cyane."
            ),
            umutekano = "Guma ushyize amavi yerekeye hasi igihe ibitsinsino bizamuka inyuma.",
            inamaYaMarcel = "Birambura imitsi yo ku bibero by'imbere mu buryo butangaje!",
            ubwoko = "Kwinyugura"
        ),
        Exercise(
            id = 26,
            izina = "Guhagarara ku manono (Calf Raises)",
            urwego = "Abatangura",
            umugwi = "Amaguru",
            inshuro = "Inshuro 20 - 25 (Imirwi 3)",
            ubusobanuro = "Yubaka imitsi y'udutsinsino n'imfundiko z'amaguru (mollets).",
            intambwe = listOf(
                "Hagarara ugororotse, fata ku rukuta niba ukeneye kuringaniza umubiri.",
                "Zamuka hejuru uhagarare ku manono y'ibirenge gusa.",
                "Komeza hejuru amasegonda 2 wumve imfundiko zikanyagiye.",
                "Manuka buhoro buhoro usubire hasi."
            ),
            umutekano = "Kora buhoro mu kumanuka kugira ngo utavunika imitsi.",
            inamaYaMarcel = "Imfundiko zikomeye zirinda imvune z'ibirenge mu buzima bwa buri munsi!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 27,
            izina = "Kwegura ikibuno hasi (Glute Bridge)",
            urwego = "Abatangura",
            umugwi = "Amaguru",
            inshuro = "Inshuro 15 - 20 (Imirwi 3)",
            ubusobanuro = "Ikomeza ikibuno, umugongo wo hasi n'inyuma y'amatako (ischio-jambiers).",
            intambwe = listOf(
                "Rambarara ugaramye hasi, pfunya amavi ibirenge birambitse hasi.",
                "Sukuma ku bitsinsino uzamura ikibuno hejuru kugeza umubiri ukoze umurongo ugororotse.",
                "Kanya imitsi y'ikibuno hejuru amasegonda 2.",
                "Manuka buhoro usubire hasi ariko udapfa kwitura hasi."
            ),
            umutekano = "Irinde kurengera hejuru cyane ngo umugongo ubabare.",
            inamaYaMarcel = "Ni umuti ukomeye ku bantu bicarira akazi igihe kirekire!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 28,
            izina = "Glute Bridge y'ukuguru kumwe (Single Leg Glute Bridge)",
            urwego = "Abageze hagati",
            umugwi = "Amaguru",
            inshuro = "Inshuro 10 - 12 kuri buri kuguru (Imirwi 3)",
            ubusobanuro = "Yikuba kabiri inguvu z'ikibuno n'umugongo kuri buri ruhande.",
            intambwe = listOf(
                "Rambarara nk'uko wari muri Glute Bridge isanzwe.",
                "Gorora ukuguru kumwe mu kirere.",
                "Sukuma hejuru ukoresheje ukuguru kurambitse hasi gusa.",
                "Kanya hejuru hanyuma umanuke buhoro, uhindure ukundi kuguru."
            ),
            umutekano = "Guma ukomeje ikibuno kitanyeganyega ku mpande.",
            inamaYaMarcel = "Uyu mwitozo ukora ku mitsi yawe itajyaga ikora!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 29,
            izina = "Superman ku mugongo (Superman Hold)",
            urwego = "Abatangura",
            umugwi = "Umugongo",
            inshuro = "Inshuro 12 x amasegonda 3 (Imirwi 3)",
            ubusobanuro = "Ukomeza umugongo wose, ibitugu n'ikibuno bikuraho ububabare bwo mu bitugu.",
            intambwe = listOf(
                "Rambarara uramvye hasi inda ireba ubutaka.",
                "Rambura amaboko imbere y'umutwe n'amaguru inyuma.",
                "Zamura amaboko, igikiriza n'amaguru hejuru icyarimwe nk'uguruka mu bicu.",
                "Shikama hejuru amasegonda 2 kugeza kuri 3, hanyuma umanuke buhoro."
            ),
            umutekano = "Humeka neza igihe uzamutse hejuru, ntugahebe umutwe cyane inyuma.",
            inamaYaMarcel = "Umugongo ukomeye ni ryo shingiro ry'umubiri uzira umuze!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 30,
            izina = "Dips ku ntebe (Tricep Dips)",
            urwego = "Abatangura",
            umugwi = "Amaboko",
            inshuro = "Inshuro 12 - 15 (Imirwi 3)",
            ubusobanuro = "Yubaka inyuma y'amaboko (triceps) n'ibitugu ukoresheje intebe cyangwa umukingo.",
            intambwe = listOf(
                "Fata ku nkombe y'intebe ikomeye amaboko ari inyuma yawe.",
                "Rambura amaguru imbere (cyangwa upfunye amavi kugira byoroshe).",
                "Manura umubiri hasi upfunya amakokora kugeza agize inguni ya dogere 90.",
                "Sukumira hejuru ukoresheje amaboko yawe usubire hejuru."
            ),
            umutekano = "Komeza umugongo hafi y'intebe igihe umanuka ntugajye kure yayo.",
            inamaYaMarcel = "Iteza imbere amaboko ku buryo imyenda ikwira neza kandi amaboko agashikama!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 31,
            izina = "Gutera amakofi mu kirere (Shadow Boxing)",
            urwego = "Abatangura",
            umugwi = "Cardio",
            inshuro = "Iminota 2 - 3 (Imirwi 3)",
            ubusobanuro = "Yongera umuvuduko, gutwika ibinure no kugorora intugu n'amaboko.",
            intambwe = listOf(
                "Hagarara witeguye, igirenge kimwe imbere n'ikindi inyuma, amakofi azamuye hafi y'amaso.",
                "Tera amakofi imbere mu buryo butandukanye: Jab, Cross, Crochet, Uppercut.",
                "Komeza unyeganyeza amaguru uhindura imyanya.",
                "Humeka usohora umwuka kuri buri kofi uteye."
            ),
            umutekano = "Ntugashyire amakokora ku mpera zayo mu buryo burenze ngo ukoboke.",
            inamaYaMarcel = "Bikuremo umunaniro n'uburakari by'umunsi wose! Kora nk'intwari!",
            ubwoko = "Kugabanya Ibinure"
        ),
        Exercise(
            id = 32,
            izina = "Gukambakamba nk'idubu (Bear Crawl)",
            urwego = "Abamenyereye",
            umugwi = "Umubiri wose",
            inshuro = "Intambwe 20 imbere n'inyuma (Imirwi 3)",
            ubusobanuro = "Umwitozo ukomeye cyane wubaka inguvu z'umubiri wose: intugu, inda n'amaguru.",
            intambwe = listOf(
                "Shinga amaboko n'ibirenge hasi, amavi ari munsi y'ikibuno ariko azamuye intambwe nto cyane hejuru y'ubutaka.",
                "Genda imbere uzana ukuboko kw'iburyo n'ukuguru kw'ibumoso icyarimwe.",
                "Komeza ugenda utareka amavi agakora hasi.",
                "Genda n'inyuma mu buryo nk'ubwo."
            ),
            umutekano = "Komeza umugongo ugororotse nk'intebe ntugazamure ikibuno hejuru.",
            inamaYaMarcel = "Ni umwitozo w'abasirikare n'abakinnyi bakomeye! Urakomeza bikomeye!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 33,
            izina = "Pike Push-ups (Pompe y'igitugu)",
            urwego = "Abageze hagati",
            umugwi = "Amaboko",
            inshuro = "Inshuro 8 - 12 (Imirwi 3)",
            ubusobanuro = "Itegura umuntu gukora pompe z'amaboko hejuru no kubaka ibitugu binini.",
            intambwe = listOf(
                "Shinga amaboko n'ibirenge hasi, zamura ikibuno hejuru cyane umubiri ukoze inyuguti ya V icuritse.",
                "Manura umutwe ugana hagati y'amaboko buhoro buhoro.",
                "Sukuma n'ibitugu uzamure umubiri hejuru."
            ),
            umutekano = "Raba ku birenge byawe ntukarebe hejuru kugira ijosi ritavunika.",
            inamaYaMarcel = "Wubaka ibitugu bitagombye ibyuma byo muri salle!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 34,
            izina = "Gusimbuka nk'ugenda ku rubura (Skater Hops)",
            urwego = "Abageze hagati",
            umugwi = "Cardio",
            inshuro = "Inshuro 20 muri rusange (Imirwi 3)",
            ubusobanuro = "Yongera ubushobozi bwo gusimbuka ku mpande n'inguvu z'amatako n'ikibuno.",
            intambwe = listOf(
                "Simbukira ku ruhande rw'iburyo ugwe ku kuguru kw'iburyo gusa.",
                "Ukuguru kw'ibumoso kugende inyuma y'ukw'iburyo.",
                "Hita usimbukira ku rundi ruhande rw'ibumoso ugwa ku kuguru kw'ibumoso.",
                "Gira amaboko nka we unyerera ku rubura."
            ),
            umutekano = "Pfunya ivi igihe uguye kugira ngo ukumire ikubitana ry'amagufwa.",
            inamaYaMarcel = "Iteza imbere amavi akomeye arinda guhendama igihe wiruka!",
            ubwoko = "Kugabanya Ibinure"
        ),
        Exercise(
            id = 35,
            izina = "Kwigorora k'inzoka (Cobra Stretch)",
            urwego = "Abatangura",
            umugwi = "Umugongo",
            inshuro = "Amasegonda 30 (Inshuro 3)",
            ubusobanuro = "Irambura imitsi y'inda n'igikiriza ikaruhura umugongo wo hasi nyuma y'imyitozo.",
            intambwe = listOf(
                "Rambarara uramvye hasi inda ireba hasi.",
                "Shinga amashyi munsi y'ibitugu.",
                "Sukuma hejuru urambura amaboko uzamura igikiriza n'umutwe.",
                "Guma muri uwo mwanya uhumeka ituze ryose."
            ),
            umutekano = "Komeza ibitugu bitazamutse mu matwi; bimanure hasi.",
            inamaYaMarcel = "Ni umwitozo mwiza cyane wo gusoza imyitozo yawe no kuruhuka!",
            ubwoko = "Kurambura Imitsi"
        ),
        Exercise(
            id = 36,
            izina = "Kuruhuka nk'umwana (Child's Pose)",
            urwego = "Abatangura",
            umugwi = "Umubiri wose",
            inshuro = "Amasegonda 45 - 60",
            ubusobanuro = "Ikuraho umunaniro mu bitugu, mu mugongo no mu mayunguyungu.",
            intambwe = listOf(
                "Ppfukama hasi, fata ikibuno ucyicaze ku bitsinsino by'ibirenge.",
                "Yagura amavi gato hanyuma urambure amaboko imbere cyane hasi.",
                "Shira agahanga hasi ku mukeka wumve umugongo urambuka.",
                "Humeka buhoro buhoro wumve umubiri wose uruhutse."
            ),
            umutekano = "Niba ubabara amavi, shira umusego munsi yayo.",
            inamaYaMarcel = "Iruseho gutuza. Iki nicyo gihe cyo gushimira umubiri wawe ku murimo wakoze!",
            ubwoko = "Kurambura Imitsi"
        ),
        Exercise(
            id = 37,
            izina = "Kwigorora kw'inshinzi n'inka (Cat-Cow Stretch)",
            urwego = "Abatangura",
            umugwi = "Umugongo",
            inshuro = "Inshuro 10 - 12 (Imirwi 2)",
            ubusobanuro = "Yoroshya urutirigongo igatuma amaraso atembera neza mu mubiri wose.",
            intambwe = listOf(
                "Shinga amaboko n'amavi hasi nk'intebe ifite amaguru ane.",
                "Inka (Cow): Humeka winjiza umwuka, manura inda hasi uzamura umutwe n'ikibuno hejuru.",
                "Inshinzi (Cat): Humeka usohora umwuka, zamura umugongo hejuru cyane ucuritse umutwe hagati y'amaboko.",
                "Komeza uhinduranya buhoro buhoro."
            ),
            umutekano = "Kora ku muvuduko w'uguhumeka kwawe nta kwihuta.",
            inamaYaMarcel = "Iyo ubyutse mu gitondo, kora ibi mbere y'ibindi byose!",
            ubwoko = "Kurambura Imitsi"
        ),
        Exercise(
            id = 38,
            izina = "Kurambura imitsi y'amatako (Hamstring Stretch)",
            urwego = "Abatangura",
            umugwi = "Amaguru",
            inshuro = "Amasegonda 30 kuri buri kuguru",
            ubusobanuro = "Irinda imitsi yo mu maguru gukanyaga no gucika nyuma yo kwiruka cyangwa gukora squat.",
            intambwe = listOf(
                "Icaye hasi urambure amaguru imbere yawe.",
                "Fata intoki ugerageze gukora ku mano y'ibirenge byawe.",
                "Komeza amavi arambije hasi.",
                "Wumve umurambuko inyuma y'amatako no mu mfundiko."
            ),
            umutekano = "Ntugahatirize cyane niba udashobora gukora ku mano; fata ku mfundiko.",
            inamaYaMarcel = "Uko ugenda ubikora kenshi, niko ugenda woroha ukagera ku mano!",
            ubwoko = "Kurambura Imitsi"
        ),
        Exercise(
            id = 39,
            izina = "Kurambura intugu n'amaboko (Shoulder Stretch)",
            urwego = "Abatangura",
            umugwi = "Amaboko",
            inshuro = "Amasegonda 30 kuri buri kuboko",
            ubusobanuro = "Ikuraho ubukakasi mu bitugu nyuma yo gukora pompe nyinshi.",
            intambwe = listOf(
                "Zana ukuboko kw'iburyo uburambike ku gikiriza kwerekeza ibumoso.",
                "Koresha ukuboko kw'ibumoso ukurure ukuboko kw'iburyo ku gikiriza.",
                "Komeza amasegonda 30 hanyuma uhindure ukundi kuboko."
            ),
            umutekano = "Komeza intugu hasi ntuzizamure mu ijosi.",
            inamaYaMarcel = "Kuruhura intugu bituma uhumeka neza kandi igikiriza kikaguka!",
            ubwoko = "Kurambura Imitsi"
        ),
        Exercise(
            id = 40,
            izina = "Kurira ku ntebe cyangwa ibuye (Step-ups)",
            urwego = "Abatangura",
            umugwi = "Amaguru",
            inshuro = "Inshuro 12 kuri buri kuguru (Imirwi 3)",
            ubusobanuro = "Yubaka amatako n'ikibuno neza ikoresheje intebe cyangwa daragi yo mu rugo.",
            intambwe = listOf(
                "Hagarara imbere y'intebe ikomeye cyangwa umukingo.",
                "Shira ikirenge cy'iburyo cyose hejuru y'intebe.",
                "Sukuma hejuru uzamure umubiri wose uhagarare hejuru y'intebe.",
                "Manuka n'ukuguru kw'ibumoso buhoro buhoro usubire hasi."
            ),
            umutekano = "Reba ko intebe idatembagara mbere yo kuyiriraho.",
            inamaYaMarcel = "Kuzamuka ibitepusi cyangwa intebe bituma amaguru agira imbaraga nk'iz'intare!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 41,
            izina = "Inchworm (Kugenda n'amaboko hasi)",
            urwego = "Abageze hagati",
            umugwi = "Umubiri wose",
            inshuro = "Inshuro 8 - 10 (Imirwi 3)",
            ubusobanuro = "Irambura inyuma y'amaguru igakomeza amaboko, igikiriza n'inda icyarimwe.",
            intambwe = listOf(
                "Hagarara wemye.",
                "Pfunya umubiri imbere ushinge intoki hasi imbere y'ibirenge.",
                "Genda n'amaboko imbere intambwe ku yindi kugeza ugeze mu mwanya wa pompe.",
                "Kora pompe imwe (niba ubishaka).",
                "Subira inyuma ugenda n'amaboko kugeza ugeze ku birenge uhaguruke."
            ),
            umutekano = "Komeza amaguru agororotse uko bishoboka kose.",
            inamaYaMarcel = "Ni umwitozo w'agatangaza wo kwinyugura umubiri wose!",
            ubwoko = "Kwinyugura"
        ),
        Exercise(
            id = 42,
            izina = "Kuzunguza inyonga n'amavi (Hip Circles Warm-up)",
            urwego = "Abatangura",
            umugwi = "Amaguru",
            inshuro = "Inshuro 10 kuri buri ruhande",
            ubusobanuro = "Yoroshya amayunguyungu n'amavi mbere yo gutangira kwiruka cyangwa squat.",
            intambwe = listOf(
                "Hagarara wemye intoki ku mayunguyungu.",
                "Zengurutsa ikibuno mu ruziga runini cyane werekeza iburyo.",
                "Ukoze inshuro 10, hindura uzengurutse werekeza ibumoso."
            ),
            umutekano = "Kora ruziga runini buhoro buhoro nta gusimbuka.",
            inamaYaMarcel = "Iyo utinyuguye inyonga, amavi ashobora kubabara. Banza unyugure!",
            ubwoko = "Kwinyugura"
        ),
        Exercise(
            id = 43,
            izina = "Kuzunguza amaboko (Arm Circles Warm-up)",
            urwego = "Abatangura",
            umugwi = "Amaboko",
            inshuro = "Amasegonda 30 imbere n'amasegonda 30 inyuma",
            ubusobanuro = "Kwinyugura kw'ibitugu bituma amaraso ashushya ingingo mbere yo gukora pompe.",
            intambwe = listOf(
                "Rambura amaboko yombi ku mpande zireba iburyo n'ibumoso.",
                "Tangira gukora utuziga duto duto werekeza imbere.",
                "Genda wagura utuziga tube tunini.",
                "Hindura icyerekezo werekeza inyuma."
            ),
            umutekano = "Komeza amaboko agororotse.",
            inamaYaMarcel = "Kora ibi umunota umwe gusa wumve ibitugu bishushe kandi byiteguye!",
            ubwoko = "Kwinyugura"
        ),
        Exercise(
            id = 44,
            izina = "High Plank to Low Plank (Hasi no Hejuru)",
            urwego = "Abamenyereye",
            umugwi = "Inda",
            inshuro = "Inshuro 10 - 12 (Imirwi 3)",
            ubusobanuro = "Ihuza imbaraga z'amaboko, igikiriza n'inda mu guhindura umwanya.",
            intambwe = listOf(
                "Tangirira mu mwanya wa pompe amaboko agororotse.",
                "Manura inkokora y'iburyo hasi, ukurikize n'iy'ibumoso (Plank yo ku makokora).",
                "Sukuma hejuru ukoresheje ikiganza cy'iburyo, ukurikize icy'ibumoso usubire hejuru.",
                "Komeza uhinduranya amaboko atangira."
            ),
            umutekano = "Guma ukanyaze ikibuno kitazenguruka cyane.",
            inamaYaMarcel = "Uyu mwitozo utuma inda yawe ikomera nk'ibuye!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 45,
            izina = "Gukubita amaguru hasi (Flutter Kicks)",
            urwego = "Abageze hagati",
            umugwi = "Inda",
            inshuro = "Amasegonda 30 - 45 (Imirwi 3)",
            ubusobanuro = "Yubaka imitsi yo hasi cyane mu nda n'amatako.",
            intambwe = listOf(
                "Rambarara ugaramye hasi, shira intoki munsi y'ikibuno gato.",
                "Zamura amaguru hejuru intambwe nto cyane hejuru y'ubutaka.",
                "Tangira gukubita amaguru hasi no hejuru buhoro buhoro nk'ugenda mu mazi.",
                "Komeza umugongo wo hasi ukanyagiye ku butaka."
            ),
            umutekano = "Ntugazamure amaguru hejuru cyane; ubugufi bwayo nibwo butera imbaraga.",
            inamaYaMarcel = "Imitsi yo hasi mu nda ni yo igoye kuyubaka, ariko flutter kicks irayitunganya!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 46,
            izina = "Bird Dog (Ukuboko n'Ukuguru mu kirere)",
            urwego = "Abatangura",
            umugwi = "Umugongo",
            inshuro = "Inshuro 10 kuri buri ruhande (Imirwi 3)",
            ubusobanuro = "Ikomeza urutirigongo n'ikibuno kandi irinda kuribwa umugongo.",
            intambwe = listOf(
                "Shinga amaboko n'amavi hasi.",
                "Rambura ukuboko kw'iburyo imbere n'ukuguru kw'ibumoso inyuma icyarimwe.",
                "Shikama hejuru amasegonda 2 umubiri ugororotse.",
                "Garuka hasi buhoro, hanyuma ukore n'ukuboko kw'ibumoso n'ukuguru kw'iburyo."
            ),
            umutekano = "Ntugapfunye umugongo hejuru cyane; guma ugororotse.",
            inamaYaMarcel = "Ni umwe mu myitozo abaganga bose b'imitsi n'amagufwa bemeza 100%!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 47,
            izina = "Dead Bug (Kwigarika ugaramye)",
            urwego = "Abatangura",
            umugwi = "Inda",
            inshuro = "Inshuro 12 muri rusange (Imirwi 3)",
            ubusobanuro = "Yigisha inda gukomera igihe amaboko n'amaguru binyeganyega nta kubabara umugongo.",
            intambwe = listOf(
                "Rambarara ugaramye, zamura amaboko hejuru y'igikiriza n'amavi apfunye kuri dogere 90.",
                "Manura ukuboko kw'iburyo inyuma y'umutwe n'ukuguru kw'ibumoso imbere hafi y'ubutaka.",
                "Garura mu mwanya wa mbere hanyuma uhinduranye n'urundi ruhande."
            ),
            umutekano = "Umugongo wo hasi ugomba kuguma ukanyagiye hasi udasize icyuho.",
            inamaYaMarcel = "Kora buhoro cyane wumve ukuntu inda yawe ifatana!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 48,
            izina = "Cossack Squats (Squat y'uruhande irambura)",
            urwego = "Abamenyereye",
            umugwi = "Amaguru",
            inshuro = "Inshuro 8 kuri buri kuguru (Imirwi 3)",
            ubusobanuro = "Yongera ubugororoke bw'amayunguyungu n'inguvu z'amatako zidasanzwe.",
            intambwe = listOf(
                "Hagarara waguye ibirenge cyane.",
                "Manukira ku kirenge cy'iburyo wicara hasi cyane, ukuguru kw'ibumoso kugororotse n'amano areba hejuru.",
                "Hagurukira hejuru hanyuma unyerere ku rundi ruhande rw'ibumoso."
            ),
            umutekano = "Komeza igitsinsino cy'ukuguru upfunye kidasohoka ku butaka.",
            inamaYaMarcel = "Uyu mwitozo utuma amaguru yawe agira ubushobozi burenze!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 49,
            izina = "Kugenda nk'intambwe y'ingagi (Gorilla Walk)",
            urwego = "Abageze hagati",
            umugwi = "Umubiri wose",
            inshuro = "Intambwe 15 imbere (Imirwi 3)",
            ubusobanuro = "Yubaka inguvu z'amatako, amaboko n'igikiriza ikoresheje uburemere bw'umubiri gusa.",
            intambwe = listOf(
                "Icaye muri squat ifunguye hasi, amaboko arambitse hasi imbere yawe.",
                "Shinga amashyi imbere hanyuma simbukana amaguru amaboko agumye hasi.",
                "Komeza ugenda imbere muri uwo mwanya muto."
            ),
            umutekano = "Komeza igikiriza kireba imbere ntabwo ari hasi.",
            inamaYaMarcel = "Imyitozo y'inyamaswa (Animal moves) ikura umubiri mu bunebwe bwa buri munsi!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 50,
            izina = "Hollow Body Hold (Gukomera nk'ubwato)",
            urwego = "Abamenyereye",
            umugwi = "Inda",
            inshuro = "Amasegonda 20 - 40 (Imirwi 3)",
            ubusobanuro = "Umwitozo ukoreshwa n'abakinnyi ba gymnastic mu kubaka inda ikomeye cyane kurusha indi yose.",
            intambwe = listOf(
                "Rambarara ugaramye hasi, rambura amaboko inyuma y'umutwe n'amaguru imbere.",
                "Zamura amaguru, amaboko n'umutwe hejuru intambwe nto gusa.",
                "Umubiri wose ube ukoze ishusho y'ubwato cyangwa ukwezi gucuritse.",
                "Shikama muri uwo mwanya wumve inda ikora ku buryo bukaze."
            ),
            umutekano = "Niba umugongo uzamutse hasi, pfunya amavi gato kugeza igihe uzakomerera.",
            inamaYaMarcel = "Amasogonda 20 y'uyu mwitozo aruta sit-ups 100 zikozwe nabi!",
            ubwoko = "Kongereza Inguvu"
        ),
        Exercise(
            id = 51,
            izina = "Kwiruka buhoro ukingira amavi (Jogging sur place)",
            urwego = "Abatangura",
            umugwi = "Cardio",
            inshuro = "Iminota 3 - 5",
            ubusobanuro = "Kwiruka aho uhagaze buhoro buhoro bituma umutima witegura cyangwa uruhuka neza.",
            intambwe = listOf(
                "Hagarara wemye unyeganyeze amaboko n'amaguru buhoro buhoro.",
                "Iruke ku muvuduko woroheje utazamura amavi cyane.",
                "Humeka mu mazuru usohore mu munwa ituze ryose."
            ),
            umutekano = "Gwa hasi woroheje ku manono.",
            inamaYaMarcel = "Kwiruka buhoro mbere na nyuma y'imyitozo birinda umunaniro ukabije w'imitsi!",
            ubwoko = "Kwinyugura"
        ),
        Exercise(
            id = 52,
            izina = "Kurambura ijosi n'igikiriza (Neck & Chest Relief)",
            urwego = "Abatangura",
            umugwi = "Umugongo",
            inshuro = "Amasegonda 30 kuri buri ruhande",
            ubusobanuro = "Ikuraho uburibwe bwo mu ijosi no mu bitugu buterwa no kureba muri telefone cyangwa mudasobwa.",
            intambwe = listOf(
                "Hagarara cyangwa wicare wemye.",
                "Egamika umutwe ku ruhande rw'iburyo witonze, wumve ijosi ry'ibumoso rirambuka.",
                "Shira ukuboko kw'iburyo hejuru y'umutwe uremerezeho gake cyane (nta gukurura).",
                "Hindura ukore n'ibumoso, hanyuma unamire umutwe imbere."
            ),
            umutekano = "Ntugakoreshe imbaraga z'umurengera ku josi.",
            inamaYaMarcel = "Iyo uhagaritse telefone ukamara iminota 2 ukora ibi, umutwe urakira burundu!",
            ubwoko = "Kurambura Imitsi"
        )
    )

    fun getExerciseById(id: Int): Exercise? = allExercises.find { it.id == id }

    fun filterExercises(query: String, urwego: String?, umugwi: String?): List<Exercise> {
        return allExercises.filter { ex ->
            val matchesQuery = query.isBlank() ||
                    ex.izina.contains(query, ignoreCase = true) ||
                    ex.ubusobanuro.contains(query, ignoreCase = true) ||
                    ex.umugwi.contains(query, ignoreCase = true)

            val matchesUrwego = urwego.isNullOrBlank() || urwego == "Vyose" || ex.urwego.equals(urwego, ignoreCase = true)
            val matchesUmugwi = umugwi.isNullOrBlank() || umugwi == "Vyose" || ex.umugwi.equals(umugwi, ignoreCase = true)

            matchesQuery && matchesUrwego && matchesUmugwi
        }
    }
}
