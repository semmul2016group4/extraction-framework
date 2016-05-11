package org.dbpedia.extraction.wikiparser.impl.wikipedia

import org.dbpedia.extraction.util.Language
import org.dbpedia.extraction.util.RichString.wrapString

/**
 * Holds the disambiguation templates of the different Wikipedia languages. Do not edit Disambiguation.scala!
 * GenerateWikiSettings.scala uses the template file Disambiguation.scala.txt to generate Disambiguation.scala.
 */
object Disambiguation
{
    private val map : Map[String, Set[String]] =
    Map("ab"->ab_disambiguations,"ace"->ace_disambiguations,"af"->af_disambiguations,"ak"->ak_disambiguations,"als"->als_disambiguations,"am"->am_disambiguations,"an"->an_disambiguations,"ang"->ang_disambiguations,"ar"->ar_disambiguations,"arc"->arc_disambiguations,"arz"->arz_disambiguations,"as"->as_disambiguations,"ast"->ast_disambiguations,"av"->av_disambiguations,"ay"->ay_disambiguations,"az"->az_disambiguations,"azb"->azb_disambiguations,"ba"->ba_disambiguations,"bar"->bar_disambiguations,"bat-smg"->bat_smg_disambiguations,"bcl"->bcl_disambiguations,"be"->be_disambiguations,"bg"->bg_disambiguations,"bjn"->bjn_disambiguations,"bm"->bm_disambiguations,"bn"->bn_disambiguations,"bpy"->bpy_disambiguations,"br"->br_disambiguations,"bs"->bs_disambiguations,"bug"->bug_disambiguations,"ca"->ca_disambiguations,"cbk-zam"->cbk_zam_disambiguations,"ce"->ce_disambiguations,"ceb"->ceb_disambiguations,"ch"->ch_disambiguations,"ckb"->ckb_disambiguations,"crh"->crh_disambiguations,"cs"->cs_disambiguations,"csb"->csb_disambiguations,"cu"->cu_disambiguations,"cv"->cv_disambiguations,"cy"->cy_disambiguations,"da"->da_disambiguations,"de"->de_disambiguations,"diq"->diq_disambiguations,"dsb"->dsb_disambiguations,"dv"->dv_disambiguations,"el"->el_disambiguations,"eml"->eml_disambiguations,"en"->en_disambiguations,"eo"->eo_disambiguations,"es"->es_disambiguations,"eu"->eu_disambiguations,"ext"->ext_disambiguations,"fa"->fa_disambiguations,"ff"->ff_disambiguations,"fi"->fi_disambiguations,"fiu-vro"->fiu_vro_disambiguations,"fo"->fo_disambiguations,"fr"->fr_disambiguations,"frp"->frp_disambiguations,"frr"->frr_disambiguations,"fur"->fur_disambiguations,"fy"->fy_disambiguations,"ga"->ga_disambiguations,"gag"->gag_disambiguations,"gan"->gan_disambiguations,"gd"->gd_disambiguations,"gl"->gl_disambiguations,"glk"->glk_disambiguations,"gn"->gn_disambiguations,"gom"->gom_disambiguations,"gv"->gv_disambiguations,"he"->he_disambiguations,"hi"->hi_disambiguations,"hif"->hif_disambiguations,"hr"->hr_disambiguations,"hsb"->hsb_disambiguations,"ht"->ht_disambiguations,"hu"->hu_disambiguations,"hy"->hy_disambiguations,"ia"->ia_disambiguations,"id"->id_disambiguations,"ie"->ie_disambiguations,"ii"->ii_disambiguations,"ilo"->ilo_disambiguations,"io"->io_disambiguations,"is"->is_disambiguations,"it"->it_disambiguations,"ja"->ja_disambiguations,"jam"->jam_disambiguations,"jv"->jv_disambiguations,"ka"->ka_disambiguations,"kaa"->kaa_disambiguations,"kab"->kab_disambiguations,"kbd"->kbd_disambiguations,"kk"->kk_disambiguations,"kl"->kl_disambiguations,"kn"->kn_disambiguations,"ko"->ko_disambiguations,"krc"->krc_disambiguations,"ksh"->ksh_disambiguations,"ku"->ku_disambiguations,"kv"->kv_disambiguations,"kw"->kw_disambiguations,"la"->la_disambiguations,"lad"->lad_disambiguations,"lb"->lb_disambiguations,"lbe"->lbe_disambiguations,"li"->li_disambiguations,"lij"->lij_disambiguations,"lmo"->lmo_disambiguations,"ln"->ln_disambiguations,"lrc"->lrc_disambiguations,"lt"->lt_disambiguations,"ltg"->ltg_disambiguations,"lv"->lv_disambiguations,"mai"->mai_disambiguations,"map-bms"->map_bms_disambiguations,"mdf"->mdf_disambiguations,"mg"->mg_disambiguations,"mhr"->mhr_disambiguations,"mi"->mi_disambiguations,"min"->min_disambiguations,"mk"->mk_disambiguations,"ml"->ml_disambiguations,"mn"->mn_disambiguations,"mo"->mo_disambiguations,"mr"->mr_disambiguations,"mrj"->mrj_disambiguations,"ms"->ms_disambiguations,"mt"->mt_disambiguations,"mwl"->mwl_disambiguations,"myv"->myv_disambiguations,"mzn"->mzn_disambiguations,"nah"->nah_disambiguations,"nap"->nap_disambiguations,"nds"->nds_disambiguations,"nds-nl"->nds_nl_disambiguations,"ne"->ne_disambiguations,"nl"->nl_disambiguations,"nn"->nn_disambiguations,"no"->no_disambiguations,"nrm"->nrm_disambiguations,"nv"->nv_disambiguations,"oc"->oc_disambiguations,"or"->or_disambiguations,"os"->os_disambiguations,"pa"->pa_disambiguations,"pam"->pam_disambiguations,"pap"->pap_disambiguations,"pdc"->pdc_disambiguations,"pfl"->pfl_disambiguations,"pl"->pl_disambiguations,"pms"->pms_disambiguations,"pt"->pt_disambiguations,"qu"->qu_disambiguations,"rm"->rm_disambiguations,"rmy"->rmy_disambiguations,"ro"->ro_disambiguations,"roa-tara"->roa_tara_disambiguations,"ru"->ru_disambiguations,"rue"->rue_disambiguations,"sa"->sa_disambiguations,"sah"->sah_disambiguations,"sc"->sc_disambiguations,"scn"->scn_disambiguations,"sco"->sco_disambiguations,"sd"->sd_disambiguations,"sh"->sh_disambiguations,"si"->si_disambiguations,"simple"->simple_disambiguations,"sk"->sk_disambiguations,"sl"->sl_disambiguations,"sq"->sq_disambiguations,"sr"->sr_disambiguations,"srn"->srn_disambiguations,"ss"->ss_disambiguations,"stq"->stq_disambiguations,"su"->su_disambiguations,"sv"->sv_disambiguations,"sw"->sw_disambiguations,"szl"->szl_disambiguations,"ta"->ta_disambiguations,"te"->te_disambiguations,"tg"->tg_disambiguations,"th"->th_disambiguations,"tl"->tl_disambiguations,"to"->to_disambiguations,"tpi"->tpi_disambiguations,"tr"->tr_disambiguations,"tt"->tt_disambiguations,"ty"->ty_disambiguations,"tyv"->tyv_disambiguations,"udm"->udm_disambiguations,"uk"->uk_disambiguations,"ur"->ur_disambiguations,"uz"->uz_disambiguations,"vec"->vec_disambiguations,"vep"->vep_disambiguations,"vi"->vi_disambiguations,"vls"->vls_disambiguations,"vo"->vo_disambiguations,"wa"->wa_disambiguations,"war"->war_disambiguations,"wo"->wo_disambiguations,"wuu"->wuu_disambiguations,"xal"->xal_disambiguations,"xmf"->xmf_disambiguations,"yi"->yi_disambiguations,"yo"->yo_disambiguations,"za"->za_disambiguations,"zea"->zea_disambiguations,"zh"->zh_disambiguations,"zh-min-nan"->zh_min_nan_disambiguations,"zh-yue"->zh_yue_disambiguations,"be-x-old"->be_tarask_disambiguations)
    private def ab_disambiguations = Set("Неоднозначность")
    private def ace_disambiguations = Set("Disambig")
    private def af_disambiguations = Set("Dubbelsinnig","Disambig")
    private def ak_disambiguations = Set("Disambig")
    private def als_disambiguations = Set("Begriffsklärung","Disambig","Begriffsklärig")
    private def am_disambiguations = Set("መንታ")
    private def an_disambiguations = Set("Desambig","Disambig","Desambigazión","Desambigación")
    private def ang_disambiguations = Set("Disambig","Geodis")
    private def ar_disambiguations = Set("Disambig","توضيح","صفحة توضيح")
    private def arc_disambiguations = Set("ܕ","ܬ.ܐ.","Disambig")
    private def arz_disambiguations = Set("توضيح")
    private def as_disambiguations = Set("দ্ব্যর্থতা_নিরসন")
    private def ast_disambiguations = Set("Dixebra")
    private def av_disambiguations = Set("Неоднозначность")
    private def ay_disambiguations = Set("Desambiguación")
    private def az_disambiguations = Set("Dəqiqləşdirmə")
    private def azb_disambiguations = Set("SIA","Mountainindex","Letter disambig","Hospitaldis","Geodis","Hndis","Fish-dab","Numberdis","Hndis-cleanup","Roaddis","Disambig-Chinese-char-title","POWdis","Schooldis","Disambig-cleanup","Mathdab","Disambiguation","Dab","Given name","Disambig","Surname","Shipindex","NA Broadcast List")
    private def ba_disambiguations = Set("Disambiguation","Күп мәғәнәлелек","Неоднозначность","Disambig")
    private def bar_disambiguations = Set("Begriffsklärung","Begriffsklearung")
    private def bat_smg_disambiguations = Set("Daugiareikšmis","Disambig")
    private def bcl_disambiguations = Set("Clarip")
    private def be_disambiguations = Set("Неадназначнасць")
    private def bg_disambiguations = Set("Пояснение","Disambig")
    private def bjn_disambiguations = Set("Disambig")
    private def bm_disambiguations = Set("Homonymie")
    private def bn_disambiguations = Set("Disambiguation","দ্ব্যর্থতা_নিরসন","দ্ব্যর্থতা নিরসন","Disambig")
    private def bpy_disambiguations = Set("দ্ব্যর্থতা_নিরসন","সন্দই চুম")
    private def br_disambiguations = Set("Project:Liammoù_ouzh_ar_pajennoù_disheñvelaat","Disheñvelout lec'hanvioù","Disheñvelout anvioù-badez","Disheñvelout","Disheñvelout anvioù-tud")
    private def bs_disambiguations = Set("Čvor")
    private def bug_disambiguations = Set("Disambig")
    private def ca_disambiguations = Set("Desambiguació")
    private def cbk_zam_disambiguations = Set("Desambiguación")
    private def ce_disambiguations = Set("Цхьа цӀе йолу урамаш","Disambiguation","Цхьа цӀе йолу меттигаш","Цхьа цӀе йолу аьчка некъа агӀонаш","Moviedis","Disambig","Дуккха маьӀнца","Цхьа цӀе йолу шагойтарш","Surname","Placedis","Metrodis","Roaddis","Неоднозначность","Цхьатера маьӀна доцуш","Доьзал цӀе")
    private def ceb_disambiguations = Set("Disambig","Giklaro")
    private def ch_disambiguations = Set("Disambig")
    private def ckb_disambiguations = Set("ڕوونکردنەوە")
    private def crh_disambiguations = Set("Disambig","Çoq manalı")
    private def cs_disambiguations = Set("Rozcestník")
    private def csb_disambiguations = Set("Disambig","Starnë_ùjednoznacznieniô")
    private def cu_disambiguations = Set("Мъногосъмꙑслиѥ","Мъногосъмꙑ́слиѥ","Disambig","Мъногосъмыслиѥ")
    private def cv_disambiguations = Set("Disambig")
    private def cy_disambiguations = Set("Anamrwysedd","Gwahaniaethu","Disambig")
    private def da_disambiguations = Set("Begriffsklärung","Navn","Disambig","Flertydig")
    private def de_disambiguations = Set("Begriffsklärung")
    private def diq_disambiguations = Set("Disambig")
    private def dsb_disambiguations = Set("Wěcejwóznamowosć","Rozjasnjenje zapśimjeśow")
    private def dv_disambiguations = Set("Disambiguation","Disambig")
    private def el_disambiguations = Set("Αποσαφήνιση","Αποσαφ","Disambig")
    private def eml_disambiguations = Set("Disambigua")
    private def en_disambiguations = Set("SIA","Mountainindex","Letter disambig","Hospitaldis","Geodis","Hndis","Fish-dab","Numberdis","Hndis-cleanup","Roaddis","Disambig-Chinese-char-title","POWdis","Schooldis","Disambig-cleanup","Mathdab","Disambiguation","Dab","Given name","Disambig","Surname","Shipindex","NA Broadcast List")
    private def eo_disambiguations = Set("Apartigilo","Disambig")
    private def es_disambiguations = Set("Desambiguación")
    private def eu_disambiguations = Set("Disambiguation","Disambig","Argipen")
    private def ext_disambiguations = Set("Desambiguáncia")
    private def fa_disambiguations = Set("ابهام‌زدایی-جغرافیا","رفع ابهام","ابهام‌زدایی","ابهام زدایی","ابهام‌زدائی")
    private def ff_disambiguations = Set("Homonymie")
    private def fi_disambiguations = Set("Täsmennyssivu","Täsmennyssivu/sukunimi","Disambig")
    private def fiu_vro_disambiguations = Set("Linke täpsüstüslehekülile","Täpsüstüslehekülg","Disambig")
    private def fo_disambiguations = Set("Fleiri týdningar","Disambig")
    private def fr_disambiguations = Set("Communes françaises homonymes","Unités homonymes","Batailles homonymes","Homonymie d'îles","Paronymie","Homonymie de route","Internationalisation","Homonymie d'établissements scolaires ou universitaires","Cantons homonymes","Homonymie bateau","Homonymie de comtés","Gouvernements homonymes","Homonymie de monument","Toponymie","Isomérie","Homonymie de nom romain","Titres homonymes","Saints homonymes","Guerres homonymes","Bandeau standard pour page d'homonymie","Homonymie de clubs sportifs","Homonymie","Villes homonymes","Patronymie","Arrondissements homonymes","Films homonymes","Patronyme basque","Patronyme italien","Homonymie dynastique","Homonymie vidéoludique","Personnes homonymes","Homonymie de parti politique","Patronyme","Homonymie édifice religieux","Édifices religieux homonymes")
    private def frp_disambiguations = Set("Homonimia")
    private def frr_disambiguations = Set("Muardüüdag artiikel","Muar Meeningen")
    private def fur_disambiguations = Set("Disambigua","Disambig","Disambiguazion")
    private def fy_disambiguations = Set("Neibetsjuttings","Tfs","Disambig")
    private def ga_disambiguations = Set("Idirdhealú","{{ns:project}}:Naisc_go_leathanaigh_idirdhealaithe")
    private def gag_disambiguations = Set("Kısaltmalar (anlam ayrımı)","Anlam ayrımı","Disambig","Anlam ayrım")
    private def gan_disambiguations = Set("消含糊","消除歧义","消歧义","消除歧義","Disambig","消歧義","消除含糊")
    private def gd_disambiguations = Set("Soilleireachadh")
    private def gl_disambiguations = Set("Disambig","Homónimos")
    private def glk_disambiguations = Set("ابهام‌زدایی")
    private def gn_disambiguations = Set("Disambig")
    private def gom_disambiguations = Set("SIA","Mountainindex","Letter disambig","Hospitaldis","Geodis","Hndis","Fish-dab","Numberdis","Hndis-cleanup","Roaddis","Disambig-Chinese-char-title","POWdis","Schooldis","Disambig-cleanup","Mathdab","Disambiguation","Dab","Given name","Disambig","Surname","Shipindex","NA Broadcast List")
    private def gv_disambiguations = Set("Reddaghey")
    private def he_disambiguations = Set("פירושונים")
    private def hi_disambiguations = Set("Disambiguation","Disambig","बहुवि","बहुविकल्पी शब्द")
    private def hif_disambiguations = Set("Disambig")
    private def hr_disambiguations = Set("Nova razdvojba","Preusmjerenje u razdvojbu","Razdvojba")
    private def hsb_disambiguations = Set("Wjacezmyslnosć")
    private def ht_disambiguations = Set("Homonymie","Menm non")
    private def hu_disambiguations = Set("Egyért-redir","Egyértelműsítő lap","Egyértelműsítő","Egyért","Disambig","Egyert")
    private def hy_disambiguations = Set("Բազմիմաստ","Բազմանշանակություն","Բի","Բազմանշանակ","Disambig","Բազմիմաստություն","Երկիմաստ")
    private def ia_disambiguations = Set("Disambiguation")
    private def id_disambiguations = Set("Disambig karya","Disambig-cleanup","Disambig nama","Disingkat","Disambig sekolah","Disambig","Disambig suku","Hndis","Disambig sejarah","Disambig bandara","Disambig tempat","Disambig tempat indo","Disambig indo1","Disambiguasi","Disambig olahraga")
    private def ie_disambiguations = Set("Disambig")
    private def ii_disambiguations = Set("消含糊","消除歧义","消歧义","消除歧義","Disambig","消歧義","消除含糊")
    private def ilo_disambiguations = Set("Disambig")
    private def io_disambiguations = Set("Homonimo")
    private def is_disambiguations = Set("Tveggja stafa aðgreining","Aðgreining")
    private def it_disambiguations = Set("Disambigua")
    private def ja_disambiguations = Set("Aimai")
    private def jam_disambiguations = Set("SIA","Mountainindex","Letter disambig","Hospitaldis","Geodis","Hndis","Fish-dab","Numberdis","Hndis-cleanup","Roaddis","Disambig-Chinese-char-title","POWdis","Schooldis","Disambig-cleanup","Mathdab","Disambiguation","Dab","Given name","Disambig","Surname","Shipindex","NA Broadcast List")
    private def jv_disambiguations = Set("Disambig panggonan","Cekakan","Disambig","Disambig suku","Disambig jeneng")
    private def ka_disambiguations = Set("მრავმნიშ","Disambig","მრავალმნიშვნელოვანი")
    private def kaa_disambiguations = Set("Disambig-cleanup","Hospitaldis","Schooldis","Numberdis","Disamb-cleanup","Disambiguation","Bio-dab","Disambig","POWdis","Surname","Hndis","SIA","Disamb","Mountainindex","Dab","Given name","Roaddis","Shipindex","Geodis","Mathdab","Hndisambig","Diasmbig","Hndis-cleanup")
    private def kab_disambiguations = Set("Asefham")
    private def kbd_disambiguations = Set("Disambig")
    private def kk_disambiguations = Set("Айрық")
    private def kl_disambiguations = Set("Disambig","Flertydig","Qulequtaqatigiit")
    private def kn_disambiguations = Set("ದ್ವಂದ್ವ ನಿವಾರಣೆ")
    private def ko_disambiguations = Set("분류 동음이의","동음이의","Disambig","동음이의어","동명이인")
    private def krc_disambiguations = Set("Disambiguation","Кёб магъаналы","Disambig")
    private def ksh_disambiguations = Set("Disambig")
    private def ku_disambiguations = Set("Cudakirin","Disambig")
    private def kv_disambiguations = Set("Неоднозначность")
    private def kw_disambiguations = Set("Klerheans")
    private def la_disambiguations = Set("Discretiva")
    private def lad_disambiguations = Set("Desambiguación")
    private def lb_disambiguations = Set("Homonymie Familljennumm","Homonymie","Homonymie Persounen","Disambig","Homonymie Ofkierzungen")
    private def lbe_disambiguations = Set("Неоднозначность")
    private def li_disambiguations = Set("Vp","Verdudeliking","Disambig","Verdudelikingpazjena")
    private def lij_disambiguations = Set("Disambigua")
    private def lmo_disambiguations = Set("Desambiguassiú","Desambiguazzion","Desambiguazion","Dezambiguasiù","Disambigua","Disambig","Desambiguació","Dezambiguasiú")
    private def ln_disambiguations = Set("Bokokani","Homonymie")
    private def lrc_disambiguations = Set("SIA","Mountainindex","Letter disambig","Hospitaldis","Geodis","Hndis","Fish-dab","Numberdis","Hndis-cleanup","Roaddis","Disambig-Chinese-char-title","POWdis","Schooldis","Disambig-cleanup","Mathdab","Disambiguation","Dab","Given name","Disambig","Surname","Shipindex","NA Broadcast List")
    private def lt_disambiguations = Set("Daugiareikšmis")
    private def ltg_disambiguations = Set("Disambiguation","Zeimeibu škiršona","Disambig")
    private def lv_disambiguations = Set("Nozīmju atdalīšana","Disambig")
    private def mai_disambiguations = Set("SIA","Mountainindex","Letter disambig","Hospitaldis","Geodis","Hndis","Fish-dab","Numberdis","Hndis-cleanup","Roaddis","Disambig-Chinese-char-title","POWdis","Schooldis","Disambig-cleanup","Mathdab","Disambiguation","Dab","Given name","Disambig","Surname","Shipindex","NA Broadcast List")
    private def map_bms_disambiguations = Set("Disambig")
    private def mdf_disambiguations = Set("Disambiguation","Фкялемса ошкужот","Moviedis","Disambig","Surname","Фкялемса фильпт","Placedis","Фкялемса кит","Фкялемса метро валгамвастт","Атянь лем","Metrodis","Roaddis","Аф фкя смузь","Лама смусть")
    private def mg_disambiguations = Set("Pejy mitovy anarana","Homonymie")
    private def mhr_disambiguations = Set("Неоднозначность","Шуку ончыктымаш-влак","Шуко ончыктымаш-влак")
    private def mi_disambiguations = Set("Disambig")
    private def min_disambiguations = Set("SIA","Mountainindex","Letter disambig","Hospitaldis","Geodis","Hndis","Fish-dab","Numberdis","Hndis-cleanup","Roaddis","Disambig-Chinese-char-title","POWdis","Schooldis","Disambig-cleanup","Mathdab","Disambiguation","Dab","Given name","Disambig","Surname","Shipindex","NA Broadcast List")
    private def mk_disambiguations = Set("ГеоПојас","Појаснување","Disambig","Geodis","ЧИ-Појаснување","Hndis")
    private def ml_disambiguations = Set("വിവക്ഷകൾ","Disambig","നാനാര്‍ത്ഥം","നാനാർത്ഥങ്ങൾ")
    private def mn_disambiguations = Set("Disambig","Салаа утгатай","Салаа")
    private def mo_disambiguations = Set("Dezambiguizare","Disambig")
    private def mr_disambiguations = Set("Disambiguation","नि:संदिग्धीकरण")
    private def mrj_disambiguations = Set("Disambig")
    private def ms_disambiguations = Set("Nyahkekaburan","Disambig")
    private def mt_disambiguations = Set("Diżambigwazzjoni","Diżambig")
    private def mwl_disambiguations = Set("Disambig")
    private def myv_disambiguations = Set("Смустень коряс явома")
    private def mzn_disambiguations = Set("ابهام‌زدایی")
    private def nah_disambiguations = Set("Desambiguación")
    private def nap_disambiguations = Set("Disambigua")
    private def nds_disambiguations = Set("Mehrdüdig_Begreep","Mehrdüdig Begreep")
    private def nds_nl_disambiguations = Set("Dv")
    private def ne_disambiguations = Set("Disambig")
    private def nl_disambiguations = Set("Dp","Dp-intro","Disambig","DP","Dpintro")
    private def nn_disambiguations = Set("Pekerside","Tobokstavforkorting","Disambig","Fleirtyding","Peikar")
    private def no_disambiguations = Set("Etternavn","Tobokstavsforkortelse","Disambiguation","Pekerside","Trebokstavsforkortelse","Disambig","Geodis","Flertydig","Hndis","Peker","Disamb")
    private def nrm_disambiguations = Set("Page dé frouque","Disambig")
    private def nv_disambiguations = Set("Ałtsʼáʼáztiin")
    private def oc_disambiguations = Set("Sigla","Omonimia","Paronimia","Omonimia2","Siglas n letras")
    private def or_disambiguations = Set("DAB","Disambiguation","Numberdis","Dab","ବହୁବିକଳ୍ପ","Disambig","Disamb")
    private def os_disambiguations = Set("Неоднозначность","Disambig")
    private def pa_disambiguations = Set("Disambig")
    private def pam_disambiguations = Set("Callsigndis","Hospitaldis","Letter-NumberCombDisambig","Numberdis","Schooldis","Disamb-cleanup","Numdab","CleanupDisambig","LatinNameDisambig","Bio-dab","Roadab","Hurricane disambig","Church disambig","Hndis","Dab-cleanup","Disamb","Dabclean","Dab","Shortcut disambig","WP-disambig","Roaddis","Cleanup-disambig","Mathdab","Hndisambig","Roadis","Shorcut disambig","Disambig-CU","Disambig-Chinese-char-title","Disambig-cleanup","Disambiguation","WP Disambig","Cleanup disambig","Letter disambig","Geo-dis","Geodab","Disambig","Airport disambig","Pamipalino","Namedab","MolFormDisambig","CJKVdab","NA Broadcast List","WP disambig","Hndab","Geodis","Hndis-cleanup")
    private def pap_disambiguations = Set("Disambig")
    private def pdc_disambiguations = Set("Begriffsklärung")
    private def pfl_disambiguations = Set("BKL")
    private def pl_disambiguations = Set("Ujednoznacznienie","Disambig")
    private def pms_disambiguations = Set("Gestion dij sinònim")
    private def pt_disambiguations = Set("Disambiguation","!Desambiguação","Desambig-ini","Desambiguação","Desambig","Disambig","Desambig-wikcionário")
    private def qu_disambiguations = Set("Sut'ichana qillqa")
    private def rm_disambiguations = Set("Sclerir noziun")
    private def rmy_disambiguations = Set("Dezambiguizare")
    private def ro_disambiguations = Set("Dezamb","Persoane omonime","DezNume","Dezambiguizare comitate SUA","Dezambiguizare","DezGeo","Disambig","Hndis","Dez")
    private def roa_tara_disambiguations = Set("Disambigua","Disambig","Sigla2","Disambigue","Sigla3")
    private def ru_disambiguations = Set("АТДы","Одноимённые объекты АТД","Станции","Одноимённые монастыри","Воинские части","Ждс","Озёра","Islanddis","Одноимённые горы","Одноимённые улицы","Список тёзок","НПы","Metrodis","Roaddis","Одноимённые железнодорожные станции","Одноимённые озёра","Одноимённые храмы","Одноимённые реки","Одноимённые острова","ЖДС","Горы","Mondis","Mountaindis","Surname","Военные части","Список однофамильцев-тёзок","Список однофамильцев","Список тёзок-однофамильцев","Одноимённые воинские части","Одноимённые площади","Воинские формирования","Неоднозначность","Многозначность","Одноимённые станции","Coorddis","Moviedis","Нпы","Churchdis","Одноимённые фильмы","Lakedis","Одноимённые корабли","Placedis","Stationdis","Militarydis","Riverdis","Реки","Одноимённые памятники","Одноименные фильмы","Disambiguation","Monumdis","Одноимённые координаты","Острова","Одноимённые муниципальные образования","Список полных тёзок","Disambig","Одноимённые населённые пункты","Одноимённые горные объекты","Одноимённые станции метро","Одноимённые НП","Неоднозначность2","Тёзки-однофамильцы","Однофамильцы-тёзки","Shipdis")
    private def rue_disambiguations = Set("Чеперушка")
    private def sa_disambiguations = Set("Disambig")
    private def sah_disambiguations = Set("Disambiguation","Элбэх суолталаах өйдөбүллэр","Неоднозначность","Disambig","Surname","Фамилия")
    private def sc_disambiguations = Set("Disambìgua","Disambigua")
    private def scn_disambiguations = Set("Disambigua","Sigla2","Sigla3")
    private def sco_disambiguations = Set("Disambig","Geodis")
    private def sd_disambiguations = Set("Disambig")
    private def sh_disambiguations = Set("Razdvojba","Višeznačnost","VZO","Višeznačna odrednica","Disambig","Razvrstavanje","Radzvojba","Homograf","Čvor")
    private def si_disambiguations = Set("Callsigndis","Letter-NumberCombDisambig","Numberdis","Schooldis","Disamb-cleanup","Numdab","CleanupDisambig","LatinNameDisambig","Biology disambiguation","Bio-dab","Hndis","Dab-cleanup","Disamb","Species Latin name disambiguation","Genus disambiguation","Dabclean","Dab","Shortcut disambig","WP-disambig","Hospital disambiguation","Mathdab","Hndisambig","Disambig-CU","Disambig-Chinese-char-title","Disambig-cleanup","Disambiguation","WP Disambig","Cleanup disambig","Letter disambig","Disambiguation cleanup","Geo-dis","Geodab","Disambig","Airport disambig","Species Latin name abbreviation disambiguation","Taxonomy disambiguation","MolFormDisambig","CJKVdab","SpeciesLatinNameDisambig","NA Broadcast List","WP disambig","Hndab","Chemistry disambiguation","Geodis","වක්‍රෝත්තිහරණ","Letter-NumberCombdisambig","Hndis-cleanup")
    private def simple_disambiguations = Set("Callsigndis","School disambiguation","Letter-NumberCombDisambig","Numberdis","Disamb-cleanup","Schooldis","Letter disambiguation","LatinNameDisambig","Biology disambiguation","Taxonomic authority disambiguation","Hndis","Dab-cleanup","Shortcut disambig","Disambiguation page","WP-disambig","Hospital disambiguation","Disambig-Chinese-char-title","Chinese title disambiguation","Cleanup disambig","Letter disambig","Mathematics disambiguation","Species Latin name abbreviation disambiguation","Taxonomy disambiguation","MolFormDisambig","CJKVdab","Chemistry disambiguation","Mathematical disambiguation","Mil-unit-dis","Airport disambiguation","Molecular formula disambiguation","Numdab","CleanupDisambig","Disambiguation-cleanup","Bio-dab","Disamb","Species Latin name disambiguation","Genus disambiguation","Dabclean","Dab","Synagogue disambiguation","Personal name disambiguation cleanup","Mathdab","Hndisambig","Wikipedia disambiguation","Disambig-CU","Disambig-cleanup","Disambiguation","WP Disambig","Call sign disambiguation","Disambiguation cleanup","Geo-dis","Geodab","Disambig","Airport disambig","DAB","SpeciesLatinNameDisambig","NA Broadcast List","WP disambig","Hndab","Geodis","Dbig","Letter-NumberCombdisambig","Hndis-cleanup")
    private def sk_disambiguations = Set("Rozlišovacia stránka")
    private def sl_disambiguations = Set("Numberdis","Razločitev","Kazalo ladij","Disambig","Disambig-ship","Priimek","Razločitev osebnih imen","Disambig-divizija","Disambig-brigada","Disambig-polk","Disambig-korpus","Disambig-armada","SloPriimek","Razločitev cest","Kratice","Geodis","Razločitev-kraj","Disambig-unit","Georaz")
    private def sq_disambiguations = Set("Kthjellim")
    private def sr_disambiguations = Set("Вишезначна одредница")
    private def srn_disambiguations = Set("Dp","Doorverwijspagina")
    private def ss_disambiguations = Set("Disambig")
    private def stq_disambiguations = Set("Begriepskläärenge")
    private def su_disambiguations = Set("Project:Tumbu_ka_kaca_disambiguasi","Disambig")
    private def sv_disambiguations = Set("3Bgren","Trebokstavsförgrening","Disambiguation","Namngrensida","Trebokstavsförkortning","3LC","Gaffel","Disambig","4LA","Fyrbokstavsförgrening","Betydelselista","Hndis","4LC","Förnamn","Grensida","Dab","Efternamn","Gren","Namnförgrening","Förgreningssida","Ortnamn","Flertydig","Förgrening","Robotskapad förgrening","TLAdisambig","3LA")
    private def sw_disambiguations = Set("Maana")
    private def szl_disambiguations = Set("Disambig")
    private def ta_disambiguations = Set("பக்கவழி நெறிப்படுத்தல்")
    private def te_disambiguations = Set("వివరమైన అయోమయ నివృత్తి","అయోమయ నివృత్తి")
    private def tg_disambiguations = Set("Ибҳомзудоӣ","Disambig")
    private def th_disambiguations = Set("แก้ความกำกวม","คำกำกวม","Disambig","แก้กำกวม")
    private def tl_disambiguations = Set("Paglilinaw","Disambig")
    private def to_disambiguations = Set("Fakaʻuhingakehe")
    private def tpi_disambiguations = Set("Disambig")
    private def tr_disambiguations = Set("Kısaltmalar (anlam ayrımı)","Kişi adları (anlam ayrımı)","Yerleşim anlam ayrımı","Anlam ayrımı","Disambig","Anlam ayrım","Sayılar (anlam ayrımı)","Coğrafya (anlam ayrımı)")
    private def tt_disambiguations = Set("Күп мәгънәләр","Күп мәгънәле")
    private def ty_disambiguations = Set("Homonymie")
    private def tyv_disambiguations = Set("SIA","Mountainindex","Letter disambig","Hospitaldis","Geodis","Hndis","Fish-dab","Numberdis","Hndis-cleanup","Roaddis","Disambig-Chinese-char-title","POWdis","Schooldis","Disambig-cleanup","Mathdab","Disambiguation","Dab","Given name","Disambig","Surname","Shipindex","NA Broadcast List")
    private def udm_disambiguations = Set("Disambiguation","Неоднозначность","Disambig","Многозначность")
    private def uk_disambiguations = Set("Disambig")
    private def ur_disambiguations = Set("Disambig")
    private def uz_disambiguations = Set("Disambig")
    private def vec_disambiguations = Set("Disanbigua","Disambigua","Dixanbigua")
    private def vep_disambiguations = Set("Äiznamoičenduz")
    private def vi_disambiguations = Set("Định hướng","Trang định hướng","Dis","Disambig","Hndis","TLAdisambig")
    private def vls_disambiguations = Set("Db","Disambig","Doorverwijspagina")
    private def vo_disambiguations = Set("Telplänov")
    private def wa_disambiguations = Set("Omonimeye")
    private def war_disambiguations = Set("Pansayod")
    private def wo_disambiguations = Set("Homonymie")
    private def wuu_disambiguations = Set("消歧義","消除歧义","消除含糊","Disambig","消除歧義","消歧义","消含糊")
    private def xal_disambiguations = Set("Медг-үлг")
    private def xmf_disambiguations = Set("მრავალმნიშვნელოვანი")
    private def yi_disambiguations = Set("באדייטן")
    private def yo_disambiguations = Set("Disambig","Ìṣojútùú")
    private def za_disambiguations = Set("消含糊","消除歧义","消歧义","消除歧義","Disambig","消歧義","消除含糊")
    private def zea_disambiguations = Set("Doorverwijspagina")
    private def zh_disambiguations = Set("Disambiguation","消除歧义","Letter disambig","消岐義","消岐義頁","Disambig","消除歧義","消歧义","消歧義頁","Chemdab","Disamb","分歧页","消歧义页","消歧義","MolFormDisambig","分歧","Dab","消除含糊","Isomerdab","分歧義","消含糊","Deprecated")
    private def zh_min_nan_disambiguations = Set("KhPI","Khu-pia̍t-iah","Khu-pia̍t-ia̍h","Disambig")
    private def zh_yue_disambiguations = Set("Disambig","搞清楚")
    private def be_tarask_disambiguations = Set("Неадназначнасць")


    def apply(language : Language) = map(language.wikiCode)

    // TODO: capitalize the values in the source code, not each time they are requested
    def get(language : Language) : Option[Set[String]] = map.get(language.wikiCode).map(_.map(_.capitalize(language.locale)))
}
