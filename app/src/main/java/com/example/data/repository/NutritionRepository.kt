package com.example.data.repository

import com.example.data.model.DailyMealPlan
import com.example.data.model.FoodItem

object NutritionRepository {

    val burundianFoods: List<FoodItem> = listOf(
        FoodItem(
            izina = "Indagara zo mu kiyaga cya Tanganyika",
            ubwoko = "Vyiza cyane",
            ubusobanuro = "Ifi ntoya z'amazi meza ziryana n'amagufwa yazo, ziboneka mu masoko yose y'i Bujumbura n'intara.",
            intungamubiri = "Calcium nyinshi cyane, Poroteyine zikomeye, na Omega-3 igaburira ubwonko.",
            inamaYaMarcel = "Kora isupu y'indagara zitogosheje n'inyanya n'ibitunguru. Ifunguro ry'imbaraga zidasanzwe!"
        ),
        FoodItem(
            izina = "Ibiharage (Haricots jaunes, rouges, kinure)",
            ubwoko = "Vyiza cyane",
            ubusobanuro = "Ifunguro rya mbere mu Burundi ry'agaciro gakomeye ku mubiri w'umuntu.",
            intungamubiri = "Poroteyine z'ibimera, Ubutare (Fer) n'imirasire (Fibres) ifasha mu nda.",
            inamaYaMarcel = "Biteke witonze bishye neza. Birinda indwara z'umutima n'umuvuduko ukabije w'amaraso."
        ),
        FoodItem(
            izina = "Imboga z'isombe na Dodo",
            ubwoko = "Vyiza cyane",
            ubusobanuro = "Amababi y'imyumbati atunganijwe (isombe) n'imboga rwatsi zo mu mirima (dodo).",
            intungamubiri = "Ubutare (Fer), Vitamini A, Vitamini C, na Vitamini K.",
            inamaYaMarcel = "Fungura isombe nibura kabiri mu ndwi; ituma amaraso yuzura mu mubiri nta kurobanura."
        ),
        FoodItem(
            izina = "Avoka nshya zo mu misozi",
            ubwoko = "Vyiza cyane",
            ubusobanuro = "Imbuto y'agatangaza yera cyane mu Burundi irinda indwara z'umutima.",
            intungamubiri = "Amavuta meza (acides gras mono-insaturés), Potasiyumu, na Vitamini E.",
            inamaYaMarcel = "Igice cy'avoka ku munsi gituma uruhu rugira itoto n'imitsi y'amaraso ikaba mizima."
        ),
        FoodItem(
            izina = "Amapapayi n'Inanasi",
            ubwoko = "Vyiza cyane",
            ubusobanuro = "Imbuto ziryoshe kamere ziboneka muri Komine zose z'i Burundi.",
            intungamubiri = "Vitamini C nyinshi, Enzyme ya Papaine na Bromélaïne zoroshya igogora.",
            inamaYaMarcel = "Fungura umuneke cyangwa ipapayi mbere yo gukora siporo kugira ugire inguvu zihuse."
        ),
        FoodItem(
            izina = "Mukeke na Sangala (Amafi yo muri Tanganyika)",
            ubwoko = "Vyiza cyane",
            ubusobanuro = "Amafi manini y'agaciro kenshi y'amazi meza adafite ibinure bibi.",
            intungamubiri = "Poroteyine nziza cyane yubaka imitsi n'imyunyungugu ifasha mu gukura.",
            inamaYaMarcel = "Ifi itetse mu buhunyane cyangwa ku nkwi niyo nziza cyane kurusha ikaranze mu mavuta menshi."
        ),
        FoodItem(
            izina = "Ibijumbu n'Ibiraya bitekanywe uruhu rwabyo",
            ubwoko = "Vyiza cyane",
            ubusobanuro = "Ifunguro riha umubiri imbaraga zirambye zo gukora ibikorwa byose by'umunsi.",
            intungamubiri = "Ibinyamasukari bizima (glucides complexes), Vitamini A na Manyeziyumu.",
            inamaYaMarcel = "Biteke mu mazi asukuye. Bitanga inguvu z'imyitozo ituma utananirwa vuba."
        ),
        FoodItem(
            izina = "Uburo n'Ibigori by'igikoma",
            ubwoko = "Vyiza cyane",
            ubusobanuro = "Ifu gakondo ikorwamo igikoma gishyushye mu gitondo cyangwa nimugoroba.",
            intungamubiri = "Ubutare, Vitamini B n'imyunyungugu yubaka ubwonko.",
            inamaYaMarcel = "Kunywa igikoma cy'uburo kidafite isukari nyinshi bitera inguvu zikomeye mu gikiriza."
        ),
        FoodItem(
            izina = "Amashaza meza n'Ibitoke",
            ubwoko = "Vyiza cyane",
            ubusobanuro = "Ifunguro ry'imbaraga rya buri rugo mu Burundi.",
            intungamubiri = "Poroteyine, Potasiyumu, n'ingufu zisukuye z'umubiri.",
            inamaYaMarcel = "Ibitoke bitekanywe amashaza ni ifunguro ry'umukinnyi ukomeye mbere y'umukino."
        ),
        // Foods to avoid / limit
        FoodItem(
            izina = "Isukari y'umurengera n'ibisuguti/bombon",
            ubwoko = "Ivyo kugabanya/kwirinda",
            ubusobanuro = "Ibisuguti, amapipi n'amasukari y'ifu yongerwa mu cyayi birenze urugero.",
            intungamubiri = "Calorie zipfuye (calorie vide) nta vitamine na nkeya.",
            inamaYaMarcel = "Isukari nyinshi yica umwijima ikazana diyabete n'umubyibuho mubi mu nda!"
        ),
        FoodItem(
            izina = "Inzoga z'indengakamere n'inzoga z'inkorano",
            ubwoko = "Ivyo kugabanya/kwirinda",
            ubusobanuro = "Inzoga zarenze urugero zangiza umwijima n'imitekerereze myiza.",
            intungamubiri = "Uburozi ku mwijima no guta amazi yose y'umubiri.",
            inamaYaMarcel = "Nta muntu ukora siporo ashobora gutera imbere anywa inzoga nyinshi buri joro!"
        ),
        FoodItem(
            izina = "Ibiryo bikaranze mu mavuta menshi yongeye gukoreshwa (Amamayege)",
            ubwoko = "Ivyo kugabanya/kwirinda",
            ubusobanuro = "Amafiriti atetswe mu mavuta yajijutse kenshi ku muriro mwinshi mu muhanda.",
            intungamubiri = "Amavuta mabi (Trans fats) aziba imitsi y'amaraso n'umutima.",
            inamaYaMarcel = "Togosa cyangwa uteke ku gipimo gito cy'amavuta y'ibihwagari aho kurya amafiriti yanduye."
        ),
        FoodItem(
            izina = "Umunyu mwinshi n'ibirungo by'inganda (Bouillons/Maggi)",
            ubwoko = "Ivyo kugabanya/kwirinda",
            ubusobanuro = "Gushyira imvange nyinshi z'ibirungo birimo umunyu ukabije mu biryo.",
            intungamubiri = "Sodiyumu y'ikirenga izamura umuvuduko w'amaraso.",
            inamaYaMarcel = "Koresha itungurusumu, igitunguru n'urusenda bisanzwe aho gukoresha ibirungo by'inganda."
        ),
        FoodItem(
            izina = "Itabi n'ibiyobyabwenge",
            ubwoko = "Ivyo kugabanya/kwirinda",
            ubusobanuro = "Kunywa itabi ry'ubwoko bwose (itabi ry'ifu, itabi ry'isegereti, shisha).",
            intungamubiri = "Imyotsi yicira udusanduku tw'ibihaha ikangiza umutima.",
            inamaYaMarcel = "Reka itabi burundu uyu munsi niba ushaka guhumeka no kuramba!"
        )
    )

    val sampleMealPlans: List<DailyMealPlan> = listOf(
        DailyMealPlan(
            izina = "Gahunda y'Abashaka Kongera Inguvu n'Imitsi",
            urwego = "Kongera Inguvu",
            igitondo = "Igikoma cy'uburo gishyushye n'amagi abiri atogosheje + umuneke umwe.",
            sasita = "Ibiharage bitekanye n'ibiraya cyangwa umuceri + imboga z'isombe + igice cy'avoka.",
            umugoroba = "Isupu y'indagara n'inyanya n'amashaza + ibitoke bitogosheje + amazi meza.",
            inama = "Nywa ibirahure 2 by'amazi hagati ya buri funguro kugira ngo poroteyine zisigaye ziseye neza."
        ),
        DailyMealPlan(
            izina = "Gahunda yo Kugabanya Ibinure no Gutwika Umubyibuho",
            urwego = "Kugabanya Ibinure",
            igitondo = "Icyayi cy'akazuyazi cya tangawizi n'indimu (nta sukari) + agapande k'ipapayi nshya.",
            sasita = "Isahani nini y'imboga rwatsi (dodo n'amashu) + igice cy'ifi ya Mukeke cyangwa indagara + ikiraya kimwe.",
            umugoroba = "Isupu y'imboga nshya n'ibihaza + udushaza duke + amazi meza.",
            inama = "Irinde kurya nyuma ya saa moya z'ijoro, kandi uryame wanyoye amazi meza y'akazuyazi."
        ),
        DailyMealPlan(
            izina = "Gahunda y'Amagara Meza no Kuringaniza Umubiri (Ubuzima busanzwe)",
            urwego = "Kuringaniza Umubiri",
            igitondo = "Igikoma cy'ibigori n'amata meza + ibijumbu bitogosheje.",
            sasita = "Ibiharage by'amabara + umuceri mucye + salade y'inyanya na avoka + amazi meza.",
            umugoroba = "Imboga z'amashu n'isombe zitekanye n'indagara + umuneke umwe mbere yo kuryama.",
            inama = "Ihame rikuru: Isahani yawe igomba kuba irimo igice cy'imboga, igice cya poroteyine n'igice cy'inguvu."
        )
    )
}
