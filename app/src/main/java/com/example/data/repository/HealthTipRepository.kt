package com.example.data.repository

import com.example.data.model.HealthTip

object HealthTipRepository {

    val allTips: List<HealthTip> = listOf(
        // 1 - 15: Amazi n'Ibinyobwa (Hydration)
        HealthTip(
            id = 1,
            icivugo = "Amazi",
            inama = "Nywa ibirahure 2 by'amazi meza ukibyuka mu gitondo",
            ubusobanuro = "Iyo ubyutse, umubiri uba umaze amasaha 7 kugeza ku 8 udakora ku mazi. Kunywa amazi abanza gukangura inyama zo mu nda, umwijima n'impyiko.",
            akamaro = "Bikuraho imyanda yirema mu mubiri ijoro ryose bikagabanya umunaniro."
        ),
        HealthTip(
            id = 2,
            icivugo = "Amazi",
            inama = "Ntugategereze kugira inyota kugira unywe amazi",
            ubusobanuro = "Inyota n'ikimenyetso cy'uko umubiri wamaze gucika amazi ku rugero rwa 1-2%. Fata akamenyero ko kunywa uduce duto ku munsi wose.",
            akamaro = "Birinda umutwe kurya n'umunaniro w'ubwonko."
        ),
        HealthTip(
            id = 3,
            icivugo = "Amazi",
            inama = "Nywa nibura litiro 2 kugeza kuri 3 z'amazi ku munsi",
            ubusobanuro = "Mu Burundi mu gihe cy'ubushyuhe n'igihe cy'imyitozo, umubiri utakaza amazi menshi binyuze mu kubira icyuya no guhumeka.",
            akamaro = "Bituma amaraso atembera neza kandi uruhu rukagira itoto."
        ),
        HealthTip(
            id = 4,
            icivugo = "Amazi",
            inama = "Irinde kunywa amazi akonje bikabije igihe urangije imyitozo",
            ubusobanuro = "Amazi akonje cyane ashobora gutera igifu guhinda umushyitsi cyangwa kugorana mu gusya igihe umubiri ugishyushye.",
            akamaro = "Kunywa amazi afite ubushyuhe buringaniye bifasha umubiri kuyakira vuba."
        ),
        HealthTip(
            id = 5,
            icivugo = "Amazi",
            inama = "Koresha amazi yatetse cyangwa asukuye neza",
            ubusobanuro = "Kwirinda indwara zikomoka ku mazi yanduye nk'impiswi, kolera n'inzoka zo mu nda ni ingirakamaro ku buzima bwawe.",
            akamaro = "Birinda uburwayi bwatuma utakaza imbaraga n'ibiro."
        ),
        HealthTip(
            id = 6,
            icivugo = "Amazi",
            inama = "Ongeramo indimu nkeya mu mazi yo mu gitondo",
            ubusobanuro = "Amazi y'indimu yoroheje atanga vitamini C ifasha ubwirinzi bw'umubiri kandi igatuma igifu gikora neza.",
            akamaro = "Yoroshya igogora ry'ibiryo kandi igasukura urwungano."
        ),
        HealthTip(
            id = 7,
            icivugo = "Amazi",
            inama = "Nywa ikirahure cy'amazi iminota 30 mbere yo gufungura",
            ubusobanuro = "Kunywa amazi mbere y'ifunguro bitegura igifu kwakira ibiryo kandi bikarinda kurya birenze urugero.",
            akamaro = "Bifasha mu kuringaniza ibiro no koroshya igogora."
        ),
        HealthTip(
            id = 8,
            icivugo = "Amazi",
            inama = "Gabanya kunywa amazi menshi hagati mu gihe urimo kurya",
            ubusobanuro = "Amazi menshi mu gihe cyo kurya yoroshya amatembabuzi n'imiti y'igifu ishinzwe gusya ibiryo.",
            akamaro = "Bituma ibiryo bisigara biseye neza nta gutumba mu nda."
        ),
        HealthTip(
            id = 9,
            icivugo = "Amazi",
            inama = "Reba ibara ry'inkari zawe buri munsi",
            ubusobanuro = "Inkari zisa n'umweru cyangwa umuhondo woroheje cyane zerekana ko amazi ahagije. Inkari z'umukara zerekana ko ukeneye amazi byihuse.",
            akamaro = "Kumenya urugero rw'amazi umubiri wawe ufite ku buryo bworoshye."
        ),
        HealthTip(
            id = 10,
            icivugo = "Amazi",
            inama = "Nywa amazi makeya mbere yo kuryama",
            ubusobanuro = "Ikirahure kimwe cy'amazi mbere yo kuryama kirinda umwuma mu ijoro ariko ntukanywe menshi atuma ubyuka kenshi kwihagarika.",
            akamaro = "Birinda guturika k'imitsi no kugabanuka k'umuvuduko w'amaraso."
        ),
        HealthTip(
            id = 11,
            icivugo = "Amazi",
            inama = "Nywa amazi mu gihe cyo gukora imyitozo",
            ubusobanuro = "Nywa amaganga make kuri buri minota 15 kugeza kuri 20 mu gihe uri mu myitozo aho kureka kugeza wumvise unaniwe.",
            akamaro = "Birinda gufatwa n'imbwa cyangwa imitsi gukanyaga."
        ),
        HealthTip(
            id = 12,
            icivugo = "Amazi",
            inama = "Fungura imbuto zifite amazi menshi nk'inanasi na watermeloni",
            ubusobanuro = "Imbuto zibamo amazi ziba zirimo n'imyunyungugu (electrolytes) ifasha umubiri gukomeza amazi mu ngirangingo.",
            akamaro = "Bikangura uruhu n'ingingo z'umubiri."
        ),
        HealthTip(
            id = 13,
            icivugo = "Amazi",
            inama = "Simbura ibinyobwa biryohereye n'amazi meza",
            ubusobanuro = "Fanta n'amajusi yo mu nganda arimo amasukari menshi atera inyota nyinshi aho kuyimara.",
            akamaro = "Bikuraho ibinure bitari ngombwa no kurinda diyabete."
        ),
        HealthTip(
            id = 14,
            icivugo = "Amazi",
            inama = "Nywa amazi y'akazuyazi igihe urwaye inkorora cyangwa ibicurane",
            ubusobanuro = "Amazi ashyushye yoroshya mu muhogo kandi agafasha gukura ibikororwa mu bihaha.",
            akamaro = "Byihutisha gukira no guhumeka neza."
        ),
        HealthTip(
            id = 15,
            icivugo = "Amazi",
            inama = "Gira icupa ry'amazi ryawe bwite aho uri hose",
            ubusobanuro = "Kuba ufite icupa ku meza cyangwa mu gikapu bituma wibuka kunywa amazi ku buryo bworoshye.",
            akamaro = "Bikuraho ubunebwe bwo kujya gushaka amazi kure."
        ),

        // 16 - 40: Imfungurwa n'Intungamubiri zo mu Burundi (Burundian Nutrition)
        HealthTip(
            id = 16,
            icivugo = "Imfungurwa Nziza",
            inama = "Fungura ibiharage kenshi (bifite poroteyine n'imirasire)",
            ubusobanuro = "Ibiharage birimo poroteyine nyinshi zikomeza imitsi, n'imirasire (fibres) igabanya amavuta mabi (cholesterol) mu maraso.",
            akamaro = "Bikomeza igihimba kandi bikarinda indwara y'umutima."
        ),
        HealthTip(
            id = 17,
            icivugo = "Imfungurwa Nziza",
            inama = "Indagara zo mu kiyaga cya Tanganyika n'ifunguro ry'agaciro",
            ubusobanuro = "Indagara ziryana n'amagufwa yazo mato, bityo zikungahaye cyane kuri Calcium ikomeza amagufwa na Omega-3 igaburira ubwonko.",
            akamaro = "Bikomeza amenyo, amagufwa n'ubwenge ku bana n'abakuze."
        ),
        HealthTip(
            id = 18,
            icivugo = "Imfungurwa Nziza",
            inama = "Fungura imboga z'isombe zitunganijwe neza",
            ubusobanuro = "Isombe ikungahaye ku butare (fer) burinda kubura amaraso, vitamini A na vitamini C zikomeza ubwirinzi bw'umubiri.",
            akamaro = "Yongera amaraso mu mubiri kandi ikagaburira ingirangingo."
        ),
        HealthTip(
            id = 19,
            icivugo = "Imfungurwa Nziza",
            inama = "Dodo n'amashu byongera imirasire yoroshya igogora",
            ubusobanuro = "Imboga rwatsi nk'amashu na dodo birinda impatwe (constipation) kandi bikungahaye kuri acide folique n'imyunyu ngugu.",
            akamaro = "Bikuraho imyanda mu mara kandi bikarinda kanseri y'amara."
        ),
        HealthTip(
            id = 20,
            icivugo = "Imfungurwa Nziza",
            inama = "Avoka itanga amavuta meza yubaka umutima",
            ubusobanuro = "Avoka ntabwo itera umubyibuho mubi; ahubwo ifite amavuta meza (acides gras monoinsaturés) asukura imitsi y'amaraso.",
            akamaro = "Yongera imbaraga, ikarinda umutima kandi igatuma uruhu rusigara rworohereye."
        ),
        HealthTip(
            id = 21,
            icivugo = "Imfungurwa Nziza",
            inama = "Fungura amapapayi n'inanasi byo mu Burundi",
            ubusobanuro = "Ipapayi ririmo enzyme yitwa papaine ifasha igifu gusya inyama n'ibindi biryo bikomeye bitatinda mu nda.",
            akamaro = "Byoroshya igifu kandi bigakiza uburyaryate bwo mu mara."
        ),
        HealthTip(
            id = 22,
            icivugo = "Imfungurwa Nziza",
            inama = "Ibijumbu n'ibiraya bitekanywe uruhu rwabyo bisukuye",
            ubusobanuro = "Ibijumbu bifite ibara ry'umuhondo byuzuye vitamine A (bêta-carotène) ikomeza amaso no gukura neza kw'uruhu.",
            akamaro = "Bitanga inguvu zirambye mu myitozo itavaho vuba."
        ),
        HealthTip(
            id = 23,
            icivugo = "Imfungurwa Nziza",
            inama = "Mukeke n'amafi yo muri Tanganyika bitanga poroteyine nziza",
            ubusobanuro = "Amafi y'amazi meza afite poroteyine yoroshye gusya kurusha inyama z'inka cyangwa ingurube.",
            akamaro = "Yubaka imitsi vuba kandi ntaremerere igifu."
        ),
        HealthTip(
            id = 24,
            icivugo = "Imfungurwa Nziza",
            inama = "Amashaza atanga inguvu na poroteyine z'ibimera",
            ubusobanuro = "Amashaza meza atetse ni ifunguro ryuzuye rifasha mu kongera imbaraga z'umubiri n'abana bakiri bato.",
            akamaro = "Ateza imbere imikurire n'imitsi ikomeye."
        ),
        HealthTip(
            id = 25,
            icivugo = "Imfungurwa Nziza",
            inama = "Uburo n'ibigori bitanga ifu y'ingirakamaro mu gikoma",
            ubusobanuro = "Igikoma cy'uburo n'ibigori bitanyuze mu nganda zisukura ifu kigumana ibice byose by'intete bikize ku butare na manyeziyumu.",
            akamaro = "Bikomeza igihimba cy'ababyeyi n'abakora siporo."
        ),
        HealthTip(
            id = 26,
            icivugo = "Imfungurwa Nziza",
            inama = "Amata meza cyangwa amavuta y'inka ku rugero rukwiye",
            ubusobanuro = "Amata y'urwanko arimo za bagiteri nziza (probiotiques) zifasha urwungano ngogozi gukora neza no kurinda indwara z'inda.",
            akamaro = "Yongera ubwirinzi bw'umubiri no gukomera kw'amagufwa."
        ),
        HealthTip(
            id = 27,
            icivugo = "Imfungurwa Nziza",
            inama = "Fungura ibiryo bitetse mu buryo bwo gutogosa aho gusekura mu mavuta",
            ubusobanuro = "Guteka utetse (bouillir cyangwa vapeur) birinda ibiryo guhinduka uburozi bwo mu mavuta yatuye ku muriro ukaze.",
            akamaro = "Bikuraho ibinure byica umwijima n'imitsi."
        ),
        HealthTip(
            id = 28,
            icivugo = "Imfungurwa Nziza",
            inama = "Gira ifunguro rigizwe n'amabara atandukanye ku isahani",
            ubusobanuro = "Ubwatsi bw'imboga, umutuku w'inyanya, umuhondo w'ipapayi n'umweru w'ibirayi byerekana ko hari vitamine zitandukanye.",
            akamaro = "Bituma ubona intungamubiri zose umubiri ukenera nta kurobanura."
        ),
        HealthTip(
            id = 29,
            icivugo = "Imfungurwa Nziza",
            inama = "Gabanya umunyu ukabije mu biryo",
            ubusobanuro = "Umunyu mwinshi utera umuvuduko ukabije w'amaraso (tension) kandi ugatuma umubiri ubika amazi mu buryo butari bwo.",
            akamaro = "Birinda impyiko n'umutima kunanirwa."
        ),
        HealthTip(
            id = 30,
            icivugo = "Imfungurwa Nziza",
            inama = "Ibitoke bitekanywe imboga n'ibiharage ni ifunguro ryuzuye",
            ubusobanuro = "Ibitoke birimo potasiyumu ikomeza imitsi n'umutima, bikuzuzanya neza n'ibiharage bitanga poroteyine.",
            akamaro = "Ifunguro gakondo ry'ikirundi riha umubiri imbaraga zose."
        ),
        HealthTip(
            id = 31,
            icivugo = "Imfungurwa Nziza",
            inama = "Fungura imbuto nshya mbere y'ibiryo bikomeye",
            ubusobanuro = "Imbuto zishyirwa mu gifu kikirimo ubusa zisigara ziseye mu minota 20; iyo uziriye nyuma y'inyama ziraborera mu gifu.",
            akamaro = "Birinda guhekenya no gutumba mu nda."
        ),
        HealthTip(
            id = 32,
            icivugo = "Imfungurwa Nziza",
            inama = "Hekenya buhoro buhoro kandi neza mu kanwa",
            ubusobanuro = "Gusya ibiryo mu kanwa n'intambwe ya mbere y'igogora. Amatembabuzi yo mu kanwa atangira gucagagura isukari n'ibinyamasukari.",
            akamaro = "Bituma igifu kitananirwa kandi ukihutirwa kumva uhaze."
        ),
        HealthTip(
            id = 33,
            icivugo = "Imfungurwa Nziza",
            inama = "Tangira umunsi n'ifunguro ry'igitondo rikize kuri poroteyine",
            ubusobanuro = "Kurya amagi cyangwa igikoma cy'uburo n'amata mu gitondo birinda inzara y'akataraboneka saa sita.",
            akamaro = "Bituma ubwonko bukora neza umunsi wose."
        ),
        HealthTip(
            id = 34,
            icivugo = "Imfungurwa Nziza",
            inama = "Irinde kuryama wamaze gufungura ifunguro rikomeye",
            ubusobanuro = "Reka nibura amasaha 2 cyangwa 3 hagati y'ifunguro rya nimugoroba no kuryama.",
            akamaro = "Birinda ibiryo kugaruka mu muhogo (reflux) no kugira ijoro rituje."
        ),
        HealthTip(
            id = 35,
            icivugo = "Imfungurwa Nziza",
            inama = "Ibitunguru n'itungurusumu n'imiti isanzwe y'umubiri",
            ubusobanuro = "Itungurusumu irimo allicine igabanya ubwandu bwa mikorobe kandi igatuma amaraso atembera mu buryo bwiza.",
            akamaro = "Birinda umuvuduko ukabije w'amaraso n'indwara z'ibicurane."
        ),
        HealthTip(
            id = 36,
            icivugo = "Imfungurwa Nziza",
            inama = "Tangawizi nshya yoroshya umutwe no kubyimbirwa",
            ubusobanuro = "Icyayi cya tangawizi nshya kirwanya kubyimbirwa mu ngingo kandi kikarinda isesemi.",
            akamaro = "Kiruhura umubiri nyuma y'imyitozo ikaze."
        ),
        HealthTip(
            id = 37,
            icivugo = "Imfungurwa Nziza",
            inama = "Koresha amavuta y'ibihwagari cyangwa elayo aho gukoresha ingurube",
            ubusobanuro = "Amavuta y'ibimera meza ntabwo aziba imitsi y'amaraso nk'amavuta afatira ku kintu kikonje.",
            akamaro = "Birinda kuremererwa umutima."
        ),
        HealthTip(
            id = 38,
            icivugo = "Imfungurwa Nziza",
            inama = "Fungura intore n'ibihaza (courges) kenshi",
            ubusobanuro = "Intore n'ibihaza birimo ibinure bike cyane ariko bikize ku myunyungugu irinda indwara z'umwijima.",
            akamaro = "Bisukura amara n'igifu mu buryo bworoshye."
        ),
        HealthTip(
            id = 39,
            icivugo = "Imfungurwa Nziza",
            inama = "Kurya urusenda ku rugero ruringaniye",
            ubusobanuro = "Urusenda rworoheje rutuma umubiri utwika ibinure vuba (capsaïcine) ariko rwinshi rwangiza igifu.",
            akamaro = "Rukangura imiti y'igifu no gukwirakwiza ubushyuhe."
        ),
        HealthTip(
            id = 40,
            icivugo = "Imfungurwa Nziza",
            inama = "Fata amafunguro ku masaha ahoraho buri munsi",
            ubusobanuro = "Iyo umubiri umenyereye igihe ibiryo bizira, amatembabuzi y'igifu ategurwa ku gihe gikwiye.",
            akamaro = "Birinda uburwayi bwa ibisebe byo mu gifu (ulcères)."
        ),

        // 41 - 55: Kuruhuka n'Itiro (Sleep & Recovery)
        HealthTip(
            id = 41,
            icivugo = "Kuruhuka",
            inama = "Ryamira amasaha 7 kugeza ku 8 buri joro",
            ubusobanuro = "Itiro ntabwo ari igihe cyo gutakaza; ahubwo nicyo gihe imitsi yongeye kwisana n'ubwonko bugasukura amakuru y'umunsi.",
            akamaro = "Bikomeza ubwirinzi bw'umubiri n'imbaraga z'umubiri."
        ),
        HealthTip(
            id = 42,
            icivugo = "Kuruhuka",
            inama = "Zimya cyangwa ushire kure telefone iminota 30 mbere yo kuryama",
            ubusobanuro = "Urumuri rw'ubururu (lumière bleue) ruva muri telefone rwica umusemburo wa mélatonine utera gusinzira.",
            akamaro = "Bituma usinzira vuba nta kurara uhirimbana."
        ),
        HealthTip(
            id = 43,
            icivugo = "Kuruhuka",
            inama = "Ryamira ku masaha amwe buri joro",
            ubusobanuro = "Guhindagura amasaha yo kuryama biteza umubiri urujijo mu isaha kamere y'umubiri (rythme circadien).",
            akamaro = "Bituma ubyuka ufite imbaraga n'akanyamuneza."
        ),
        HealthTip(
            id = 44,
            icivugo = "Kuruhuka",
            inama = "Kora imyitozo yo kurambura imitsi nyuma ya siporo",
            ubusobanuro = "Kurambura imitsi (étirement) bicyura amaraso mu ngirangingo kandi bikarinda imitsi gutera uburibwe ku munsi ukurikira.",
            akamaro = "Birinda kuribwa mu mavi no mu mugongo."
        ),
        HealthTip(
            id = 45,
            icivugo = "Kuruhuka",
            inama = "Fata umunsi umwe cyangwa ibiri yo kuruhuka mu ndwi",
            ubusobanuro = "Imitsi ikurira mu gihe cyo kuruhuka ntabwo ari mu gihe uri mu myitozo. Kwitoza buri munsi nta kiruhuko bitera imvune.",
            akamaro = "Bituma umubiri wisana ukiyongeraho inguvu nshya."
        ),
        HealthTip(
            id = 46,
            icivugo = "Kuruhuka",
            inama = "Koga amazi y'akazuyazi mbere yo kuryama",
            ubusobanuro = "Amazi y'akazuyazi arambura imitsi yose yari ikanyagiye kubera umunaniro w'umunsi.",
            akamaro = "Bitera itiro ryimbitse kandi riruhuye."
        ),
        HealthTip(
            id = 47,
            icivugo = "Kuruhuka",
            inama = "Ryamira mu cyumba cyijimye kandi gikonje gake",
            ubusobanuro = "Umwijima wuzuye utuma umubiri usohora mélatonine ku rugero rwo hejuru.",
            akamaro = "Bikuraho guhagarika umutima mu ijoro."
        ),
        HealthTip(
            id = 48,
            icivugo = "Kuruhuka",
            inama = "Irinde ikawa n'icyayi cy'icyatsi nyuma ya saa kumi z'umugoroba",
            ubusobanuro = "Caféine ifata amasaha agera kuri 6 kugeza ku 8 mu mubiri mbere yo gusohoka burundu.",
            akamaro = "Birinda kubura itiro no gutera umutima ugasakuza mu gitanda."
        ),
        HealthTip(
            id = 49,
            icivugo = "Kuruhuka",
            inama = "Fata akaruhuko gato k'iminota 15-20 ku manywa (sieste)",
            ubusobanuro = "Kuruhuka akanya gato nyuma ya saa sita byongera ubushobozi bwo gutekereza n'ubushyuhe bwo gukora.",
            akamaro = "Bikangura ubwonko nta kwica itiro ryo mu ijoro."
        ),
        HealthTip(
            id = 50,
            icivugo = "Kuruhuka",
            inama = "Rambika amaguru hejuru ku rukuta iminota 10 nyuma yo kwiruka",
            ubusobanuro = "Kuzamura amaguru bituma amaraso yari yibumbiye hasi asubira mu mutima no mu bihaha ku buryo bworoshye.",
            akamaro = "Bikuraho uburemere mu birenge n'amavuta mu maguru."
        ),
        HealthTip(
            id = 51,
            icivugo = "Kuruhuka",
            inama = "Humeka mu buryo bwimbitse (Inspiration n'Expiration ituje)",
            ubusobanuro = "Kwinjiza umwuka muremure mu mazuru ugatwika amasegonda 4 hanyuma ukasohora buhoro mu munwa amasegonda 6 bigabanya stress.",
            akamaro = "Bimanura umuvuduko w'umutima n'umunaniro w'intekerezo."
        ),
        HealthTip(
            id = 52,
            icivugo = "Kuruhuka",
            inama = "Irinde gutekereza ku bibazo by'akazi mu buriri",
            ubusobanuro = "Uburiri bugomba guhuzwa n'itiro gusa. Iyo ubuhuje n'impagarara, ubwonko buranga bugasinzira.",
            akamaro = "Biteza imbere amahoro yo mu mutima."
        ),
        HealthTip(
            id = 53,
            icivugo = "Kuruhuka",
            inama = "Itegereze ibimenyetso by'umunaniro ukabije (Overtraining)",
            ubusobanuro = "Niba wumva udashaka kurya, utabasha gusinzira, kandi umubiri ukubabara birenze urugero, fata iminsi 2 uruhuke.",
            akamaro = "Birinda kwangirika kw'imitsi n'ingingo."
        ),
        HealthTip(
            id = 54,
            icivugo = "Kuruhuka",
            inama = "Gira umusego utari muremure cyane cyangwa muto cyane",
            ubusobanuro = "Ijosi rigomba kugororoka n'urutirigongo igihe uryamye ku ruhande cyangwa ugaramye.",
            akamaro = "Birinda uburibwe bwo mu ijosi no guta umutwe mugitondo."
        ),
        HealthTip(
            id = 55,
            icivugo = "Kuruhuka",
            inama = "Igomwe kuryama ugaramye niba unyereza cyangwa uronka nabi",
            ubusobanuro = "Kuryamira uruhande rw'ibumoso byoroshya umwijima n'igifu kandi bikarinda ibiryo kugaruka mu muhogo.",
            akamaro = "Byoroshya guhumeka no gusinzira neza."
        ),

        // 56 - 70: Kwirinda Ibonona Amagara (Foods and Habits to Avoid)
        HealthTip(
            id = 56,
            icivugo = "Ivyo Kwirinda",
            inama = "Gabanya isukari y'umurengera n'ibinini biryohereye",
            ubusobanuro = "Isukari nyinshi yangiza umwijima, igatera umubyibuho ukabije, kandi ikangiza uruhu n'amenyo.",
            akamaro = "Birinda indwara ya diyabete n'umunaniro w'akanya gato."
        ),
        HealthTip(
            id = 57,
            icivugo = "Ivyo Kwirinda",
            inama = "Kwirinda inzoga z'indengakamere",
            ubusobanuro = "Inzoga nyinshi zangiza umwijima, zikica ubwonko, kandi zigatesha umubiri amazi yose yari arimo.",
            akamaro = "Bikomeza ingufu z'umubiri n'imitekerereze myiza."
        ),
        HealthTip(
            id = 58,
            icivugo = "Ivyo Kwirinda",
            inama = "Itabi n'umwanzi ukomeye w'ibihaha n'umutima",
            ubusobanuro = "Umwotsi w'itabi uziba imitsi y'amaraso kandi ukangiza udusanduku duto tw'ibihaha dukuramo umwuka mwiza.",
            akamaro = "Kureka itabi byongera umwuka mu kwiruka mu byumweru bibiri gusa."
        ),
        HealthTip(
            id = 59,
            icivugo = "Ivyo Kwirinda",
            inama = "Kwirinda kurya ibiryo biryoshe cyane bitekanywe amavuta menshi",
            ubusobanuro = "Amavuta akoreshwa inshuro nyinshi mu mafiriti atanga ibinyabutabire byitwa trans fats bifunga imitsi y'amaraso.",
            akamaro = "Birinda guturika k'imitsi n'uburwayi bw'umutima."
        ),
        HealthTip(
            id = 60,
            icivugo = "Ivyo Kwirinda",
            inama = "Kwirinda imiti yose y'ingufu idafite inama ya muganga",
            ubusobanuro = "Ibinini n'imiti byitwa ko byongera inguvu vuba bishobora kwangiza impyiko n'umwijima burundu.",
            akamaro = "Kwiringira ibiryo byiza n'imyitozo bisanzwe bitanga ubuzima burambye."
        ),
        HealthTip(
            id = 61,
            icivugo = "Ivyo Kwirinda",
            inama = "Kwirinda kurya uhagaze cyangwa wiruka",
            ubusobanuro = "Kurya unyeganyega bituma umira umwuka mwinshi bityo igifu kikatumba kikababara.",
            akamaro = "Kwicara ugatuza bifasha mu igogora ryiza."
        ),
        HealthTip(
            id = 62,
            icivugo = "Ivyo Kwirinda",
            inama = "Irinde kurobanura ibiryo usiga imboga rwatsi",
            ubusobanuro = "Abantu benshi barya ibinyamafufu gusa (ibiraya, umuceri) bakirengagiza imboga; ibi bitera kubura vitamine z'ingenzi.",
            akamaro = "Kuringaniza ifunguro n'urufunguzo rw'amagara mazima."
        ),
        HealthTip(
            id = 63,
            icivugo = "Ivyo Kwirinda",
            inama = "Kwirinda kuryama umunsi wose udakoze n'intambwe imwe",
            ubusobanuro = "Kwicara umwanya munini bituma amaraso adatemba neza mu maguru bikongera ibyago byo kuziba k'udutsi tw'amaraso.",
            akamaro = "Guhaguruka buri saha ukagendagenda iminota 2 birinda ibyo byago."
        ),
        HealthTip(
            id = 64,
            icivugo = "Ivyo Kwirinda",
            inama = "Kwirinda kwihagarika ugatinza inkari ku bushake",
            ubusobanuro = "Kubika inkari mu ruhago igihe kirekire bituma za bagiteri zororoka zikangiza uruhago n'impyiko.",
            akamaro = "Kwihagarika ku gihe birinda uburwayi bwo mu nzira y'inkari."
        ),
        HealthTip(
            id = 65,
            icivugo = "Ivyo Kwirinda",
            inama = "Kwirinda ifu z'inganda zasukuwe bikabije (farine blanche)",
            ubusobanuro = "Umugati w'umweru n'amakaroni byakuwemo imirasire byose biba bisa n'isukari itera umubyibuho w'ikirenga.",
            akamaro = "Guhitamo ibinyampeke byuzuye byongera inguvu zirambye."
        ),
        HealthTip(
            id = 66,
            icivugo = "Ivyo Kwirinda",
            inama = "Irinde koga amazi akonje cyane ukiva mu bushyuhe bukabije",
            ubusobanuro = "Guhindura ubushyuhe bw'umubiri vuba bishobora gutera umutima guhinda cyangwa kubyimba kw'imitsi y'ubuhumekero.",
            akamaro = "Reka umubiri ubanze uhore buhoro mbere yo koga."
        ),
        HealthTip(
            id = 67,
            icivugo = "Ivyo Kwirinda",
            inama = "Kwirinda ifunguro rimwe ririmo ibintu byinshi byose icyarimwe",
            ubusobanuro = "Kurya ibyokurya birenze ubushobozi bw'isahani byuzuye ibinure byinshi biruhya umubiri bikawutera gusinzira.",
            akamaro = "Kurya gake gashoboka kenshi biruta guhaga bikabije rimwe."
        ),
        HealthTip(
            id = 68,
            icivugo = "Ivyo Kwirinda",
            inama = "Kwirinda kwihambira ku myitozo ikaze ku munsi wa mbere",
            ubusobanuro = "Gushaka gukora nka champion ku munsi wa mbere bitera imvune zikubuza kongera gukora siporo amezi abiri.",
            akamaro = "Buhoro buhoro ni bwo buryo bwizewe bwageza ku ntsinzi."
        ),
        HealthTip(
            id = 69,
            icivugo = "Ivyo Kwirinda",
            inama = "Kwirinda kunywa imitobe yo mu makarito itarimo imbuto nyazo",
            ubusobanuro = "Iyi mitobe iba yuzuyemo amazi n'isukari hamwe n'amabara y'inganda gusa nta kamaro ku buzima.",
            akamaro = "Koresha imbuto zisanzwe zikomoka ku biti byo mu Burundi."
        ),
        HealthTip(
            id = 70,
            icivugo = "Ivyo Kwirinda",
            inama = "Kwirinda gufata ibinini byo gutuza cyangwa kuruhuka nta cyemezo",
            ubusobanuro = "Ibi binini bituma umubiri ubimenyera ugacika intege mu kwisinziriza kamere.",
            akamaro = "Koresha imyitozo n'amazi ashyushye mu gushaka ituze."
        ),

        // 71 - 85: Imyitozo n'Imbaraga z'Umubiri (Fitness & Exercise Principles)
        HealthTip(
            id = 71,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Kwinyugura iminota 5 mbere yo gutangira umwitozo uwo ari wo wose",
            ubusobanuro = "Kwinyugura bishyushya amaraso, bigafungura ingingo, kandi bikaburira umutima ko akazi kagiye gutangira.",
            akamaro = "Birinda gucika imitsi n'imvune zitunguranye."
        ),
        HealthTip(
            id = 72,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Guhumeka neza mu gihe cy'imyitozo (Ntugafate umwuka)",
            ubusobanuro = "Humeka winjiza umwuka mu gihe woroheje, uhumeke usohora umwuka mu gihe usunika cyangwa uzamura uburemere.",
            akamaro = "Bituma umuvuduko w'amaraso udakabya kuzamuka mu mutwe."
        ),
        HealthTip(
            id = 73,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Kora imyitozo y'uburemere bw'umubiri wawe mbere y'ibyuma",
            ubusobanuro = "Pompe, squats, na fentes byubaka imizi ikomeye n'imikoranire myiza y'imitsi nta kiguzi na kimwe.",
            akamaro = "Bikomeza umubiri wose ku buryo busanzwe."
        ),
        HealthTip(
            id = 74,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Kugira intego ihoraho: iminota 30 ku munsi, iminsi 3 kugeza kuri 5 mu ndwi",
            ubusobanuro = "Gukora gato buri gihe biruta gukora amasaha 4 rimwe mu kwezi.",
            akamaro = "Uhoraho ni we ubona umusaruro urambye."
        ),
        HealthTip(
            id = 75,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Kwiruka cyangwa kugenda n'amaguru bishyira umutima ku murongo",
            ubusobanuro = "Kugenda intambwe 8,000 kugeza ku 10,000 ku munsi bigabanya ibyago byo kurwara umutima ku kigero cya 50%.",
            akamaro = "Bituma amagufwa akomera kandi umwijima ugakora neza."
        ),
        HealthTip(
            id = 76,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Guhindura imyitozo kugira ngo umubiri utamenyera",
            ubusobanuro = "Iyo ukoze umwitozo umwe buri gihe, umubiri urawumenyera ugahagarika gutera imbere.",
            akamaro = "Guhindura bituma imitsi mishya ikora igakura."
        ),
        HealthTip(
            id = 77,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Wumve umubiri wawe: Uburibwe bwiza n'uburibwe bubi",
            ubusobanuro = "Uburibwe bwo gutwika mu mitsi ni bwiza; uburibwe butera mu ngingo, mu mavi cyangwa mu rutirigongo ni ikimenyetso cyo guhagarara.",
            akamaro = "Birinda imvune zikomeye zo mu ngingo."
        ),
        HealthTip(
            id = 78,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Kora imyitozo yo mu gitondo kare kugira ngo ufungure umunsi",
            ubusobanuro = "Gukora imyitozo kare bizamura umusemburo wa endorphine utera ibyishimo n'inguvu zo gukorana akanyamuneza.",
            akamaro = "Bikuraho umunaniro n'ubunebwe bw'umunsi wose."
        ),
        HealthTip(
            id = 79,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Shyira umwete ku mitsi y'inda n'umugongo (Gainage)",
            ubusobanuro = "Iyi mitsi y'imbere (core) niyo ifashe umubiri wose; iyo ifite intege nke, umugongo urababara n'intambwe igacumbagira.",
            akamaro = "Bikomeza igihimba n'ihagarara ry'umubiri."
        ),
        HealthTip(
            id = 80,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Kora imyitozo y'amaguru n'ikibuno kuko ifite imitsi minini",
            ubusobanuro = "Imitsi yo mu maguru niyo minini mu mubiri; kuyikoresha bituma umubiri utwika ingufu n'ibinure byinshi kurenza indi yose.",
            akamaro = "Byihutisha kugabanya inda n'ibinure birenze."
        ),
        HealthTip(
            id = 81,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Koresha inkweto zikwiye igihe wiruka ku butaka bukomeye",
            ubusobanuro = "Inkweto zidasigaye cyane zigabanya ikubitana ry'amagufwa ku bitaro n'amavi.",
            akamaro = "Birinda uburibwe bw'udutsinsino no kuryana kw'amavi."
        ),
        HealthTip(
            id = 82,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Kugira inshuti cyangwa umuterambere mukorana imyitozo",
            ubusobanuro = "Gukorana n'undi muntu bituma mudacika intege kandi mugashishikarizanya gukomeza ku minsi y'ubukonje.",
            akamaro = "Byongera umurava n'intego zishyitse."
        ),
        HealthTip(
            id = 83,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Fata ifunguro rito ririmo imbuto mbere yo gukora siporo",
            ubusobanuro = "Umuneke umwe cyangwa igice cy'ipapayi iminota 30 mbere yo gukora biha umubiri isukari kamere ikora ako kanya.",
            akamaro = "Birinda kuzungera cyangwa gucika intege hagati mu mwitozo."
        ),
        HealthTip(
            id = 84,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Fungura poroteyine mu minota 45 nyuma y'imyitozo",
            ubusobanuro = "Iki nicyo gihe imitsi yakira intungamubiri vuba kurusha ikindi gihe cyose (fenêtre métabolique).",
            akamaro = "Byubaka imitsi mishya vuba kandi bikayikomeza."
        ),
        HealthTip(
            id = 85,
            icivugo = "Imyitozo n'Imbaraga",
            inama = "Ntugapime iterambere ku munzani gusa; reba imbaraga n'imyenda",
            ubusobanuro = "Imitsi iremereye kurusha ibinure; uramutse wubatse imitsi ugatwika ibinure, ibiro bishobora kutahinduka ariko umubiri ugatungana.",
            akamaro = "Birinda gucika intege bitari ngombwa."
        ),

        // 86 - 100: Isuku, Igogora, Ubwenge n'Amagara Meza (Hygiene & Holistic Wellness)
        HealthTip(
            id = 86,
            icivugo = "Isuku n'Ubuzima",
            inama = "Karaba intoki n'amazi meza n'isabune kenshi",
            ubusobanuro = "Intoki nizo zambutsa mikorobe nyinshi ziva ku bintu ukoraho zijya mu maso, mu mazuru no mu kanwa.",
            akamaro = "Birinda indwara z'inzoka, ibicurane n'impiswi."
        ),
        HealthTip(
            id = 87,
            icivugo = "Isuku n'Ubuzima",
            inama = "Koza amenyo kabiri ku munsi (mu gitondo na mbere yo kuryama)",
            ubusobanuro = "Udukoko two mu kanwa turya ibisigazwa by'ibiryo bikabyara acide icukura amenyo ikanatera impumuro mbi.",
            akamaro = "Bikomeza ishinya n'amenyo mazima."
        ),
        HealthTip(
            id = 88,
            icivugo = "Isuku n'Ubuzima",
            inama = "Gufata akayaga keza k'izuba ryo mu gitondo (Vitamini D)",
            ubusobanuro = "Izuba ryo kuva saa moya kugeza saa tatu rishyira vitamini D mu ruhu, ifasha gukomeza amagufwa n'ubwirinzi bw'umubiri.",
            akamaro = "Birinda amagufwa koroha no kurwara indwara z'amagufwa."
        ),
        HealthTip(
            id = 89,
            icivugo = "Isuku n'Ubuzima",
            inama = "Seka kenshi kandi ugire umutima ukeye",
            ubusobanuro = "Guseka bisohora imisemburo irwanya agahinda gakabije (dopamine na sérotonine) igabanya umunaniro mu mubiri.",
            akamaro = "Bifasha umutima gutera neza kandi bikongera iminsi yo kubaho."
        ),
        HealthTip(
            id = 90,
            icivugo = "Isuku n'Ubuzima",
            inama = "Sukura imbuto n'imboga n'amazi meza mbere yo kubirya",
            ubusobanuro = "Imbuto n'imboga bishobora kuba biriho imiti yicira udukoko cyangwa umukungugu w'inzira.",
            akamaro = "Birinda kurogwa n'imiti y'ubuhinzi."
        ),
        HealthTip(
            id = 91,
            icivugo = "Isuku n'Ubuzima",
            inama = "Irinde kwinjirira mu bwiherero udakwese inkweto",
            ubusobanuro = "Ubutaka bwo mu bwiherero bushobora kuba burimo inzoka zicengera mu birenge nka hookworm zikica amaraso.",
            akamaro = "Birinda indwara z'amaraso n'inzoka zo mu nda."
        ),
        HealthTip(
            id = 92,
            icivugo = "Isuku n'Ubuzima",
            inama = "Reka umwuka mwiza winjire mu nzu buri gitondo",
            ubusobanuro = "Gufungura amadirishya bituma umwuka mubi wari waraye mu nzu usohoka hagasimburwa n'umwuka ukungahaye kuri oxygène.",
            akamaro = "Bikiza ibicurane n'umutwe wo mu gitondo."
        ),
        HealthTip(
            id = 93,
            icivugo = "Isuku n'Ubuzima",
            inama = "Gabanya umunaniro w'ibitekerezo (Stress Management)",
            ubusobanuro = "Umunaniro uhoraho uzamura umusemburo wa cortisol utera kubika ibinure mu nda no kurwara umutima.",
            akamaro = "Kugira gahunda no gusenga cyangwa gutuza byoroshya umutima."
        ),
        HealthTip(
            id = 94,
            icivugo = "Isuku n'Ubuzima",
            inama = "Genzura amaso yawe n'uburebure bw'ibikoresho",
            ubusobanuro = "Irinde gushyira telefone hafi cyane y'amaso mu mwijima; bitera umunaniro w'imitsi y'amaso n'ubuhumyi bwa hafi.",
            akamaro = "Birinda kurwara amaso n'umutwe uhoraho."
        ),
        HealthTip(
            id = 95,
            icivugo = "Isuku n'Ubuzima",
            inama = "Kora isuzuma ry'ubuzima (Check-up) nibura rimwe mu mwaka",
            ubusobanuro = "Gupima umuvuduko w'amaraso (tension) n'isukari mu maraso bituma umuntu amenya uburwayi butararenga igaruriro.",
            akamaro = "Kwirinda biruta kwivuza igihe cyose."
        ),
        HealthTip(
            id = 96,
            icivugo = "Isuku n'Ubuzima",
            inama = "Gira isuku y'ibikoresho byawe by'imyitozo",
            ubusobanuro = "Icyuya gisigara ku mukeka cyangwa ku myenda gishobora kororokeramo imiyege n'udukoko dutera uduhere ku ruhu.",
            akamaro = "Birinda uburwayi bw'uruhu n'impumuro mbi."
        ),
        HealthTip(
            id = 97,
            icivugo = "Isuku n'Ubuzima",
            inama = "Kwirinda guhagarika umunsi wose udasomye cyangwa ngo wige ikintu gishya",
            ubusobanuro = "Gutoza ubwonko kwiga bimeze nko gukora imyitozo y'imitsi; birinda ubwonko gusaza vuba no kwibagirwa.",
            akamaro = "Bikomeza ubwenge n'ubushobozi bwo gufata ibyemezo."
        ),
        HealthTip(
            id = 98,
            icivugo = "Isuku n'Ubuzima",
            inama = "Gira umubano mwiza n'abandi bantu mu muryango",
            ubusobanuro = "Kwigumana wenyine n'ikintu kibabaza umutima n'umubiri ku kigero kingana no kunywa itabi ku munsi.",
            akamaro = "Urukundo n'ubucuti bizana kuramba n'amagara mazima."
        ),
        HealthTip(
            id = 99,
            icivugo = "Isuku n'Ubuzima",
            inama = "Shima umubiri wawe kandi ushimire ku byo ushoboye gukora",
            ubusobanuro = "Kwikunda no kwishimira intambwe nto utera bituma utiyanga cyangwa ngo ucike intege mu rugendo rw'ubuzima.",
            akamaro = "Bitera imbaraga zo gukomeza imbere igihe cyose."
        ),
        HealthTip(
            id = 100,
            icivugo = "Isuku n'Ubuzima",
            inama = "Ibuka ihame rikuru: AMAGARA IMBERE YA VYOSE!",
            ubusobanuro = "Ubutunzi, akazi, n'inzozi byose ntacyo bimaze udafite amagara mazima yo kubyishimira. Fata umwanya wo kwita ku buzima bwawe buri munsi.",
            akamaro = "Umutuzo, imbaraga n'ubuzima buzira umuze iteka ryose!"
        )
    )

    fun filterTips(query: String, category: String?): List<HealthTip> {
        return allTips.filter { tip ->
            val matchesQuery = query.isBlank() ||
                    tip.inama.contains(query, ignoreCase = true) ||
                    tip.ubusobanuro.contains(query, ignoreCase = true) ||
                    tip.akamaro.contains(query, ignoreCase = true)

            val matchesCategory = category.isNullOrBlank() || category == "Vyose" || tip.icivugo.equals(category, ignoreCase = true)

            matchesQuery && matchesCategory
        }
    }
}
