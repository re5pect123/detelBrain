package net.spring.controller;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import net.spring.dao.BillingRecordsTeles;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    BillingRecordsTeles billingRecordsTelesDao;

    @RequestMapping(value = "/login")
    public String vrati() {
        return "login";
    }

    @RequestMapping(value = "/proba")
    public String izvestaj(ModelMap model) throws SQLException, ClassNotFoundException {
        /*  //1
        String ostvareniTelefonskiSaobracajOdFiksneKaFiksnimMrezama = billingRecordsTelesDao.ostvareniTelefonskiSaobracajOdFiksneKaFiksnimMrezama();
        model.addAttribute("ostvareniTelefonskiSaobracajOdFiksneKaFiksnimMrezama", ostvareniTelefonskiSaobracajOdFiksneKaFiksnimMrezama);
        System.out.println(ostvareniTelefonskiSaobracajOdFiksneKaFiksnimMrezama);
        //2
        Double ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama = billingRecordsTelesDao.ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama();
        model.addAttribute("ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama", ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama);
        //2.1
        String ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama_Telekom_Srbija = billingRecordsTelesDao.ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama_Telekom_Srbija();
        model.addAttribute("ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama_Telekom_Srbija", ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama_Telekom_Srbija);
        //2.2
        String ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama_SBB = billingRecordsTelesDao.ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama_SBB();
        model.addAttribute("ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama_SBB", ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama_SBB);
        //2.3
        String ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama_ORION = billingRecordsTelesDao.ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama_ORION();
        model.addAttribute("ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama_ORION", ostvareniTelefonskiSaobracaj_Od_Fiksne_Ka_Drugim_Domacim_Fiksnim_Mrezama_ORION);
        //3
        String ostvareniTelefonskiSaobracaj_od_Fiksne_Ka_Mobilnim_Mrezama = billingRecordsTelesDao.ostvareniTelefonskiSaobracaj_od_Fiksne_Ka_Mobilnim_Mrezama();
        model.addAttribute("ostvareniTelefonskiSaobracaj_od_Fiksne_Ka_Mobilnim_Mrezama", ostvareniTelefonskiSaobracaj_od_Fiksne_Ka_Mobilnim_Mrezama);
        //3.1
        String ostvareniTelefonskiSaobracaj_od_Fiksne_Ka_Mobilnim_Mrezama_Ka_Domacim_Operatorima = billingRecordsTelesDao.ostvareniTelefonskiSaobracaj_od_Fiksne_Ka_Mobilnim_Mrezama_Ka_Domacim_Operatorima();
        model.addAttribute("ostvareniTelefonskiSaobracaj_od_Fiksne_Ka_Mobilnim_Mrezama_Ka_Domacim_Operatorima", ostvareniTelefonskiSaobracaj_od_Fiksne_Ka_Mobilnim_Mrezama_Ka_Domacim_Operatorima);
        //3.2
        String ostvareniTelefonskiSaobracaj_od_Fiksne_Ka_Mobilnim_Mrezama_Ka_Inostranim_Operatorima = billingRecordsTelesDao.ostvareniTelefonskiSaobracaj_od_Fiksne_Ka_Mobilnim_Mrezama_Ka_Inostranim_Operatorima();
        model.addAttribute("ostvareniTelefonskiSaobracaj_od_Fiksne_Ka_Mobilnim_Mrezama_Ka_Inostranim_Operatorima", ostvareniTelefonskiSaobracaj_od_Fiksne_Ka_Mobilnim_Mrezama_Ka_Inostranim_Operatorima);
        //4
        Double ostvareni_telefonski_saobracaj_ka_negeografskim_i_kratkim_kodovima = billingRecordsTelesDao.ostvareni_telefonski_saobracaj_ka_negeografskim_i_kratkim_kodovima();
        model.addAttribute("ostvareni_telefonski_saobracaj_ka_negeografskim_i_kratkim_kodovima", ostvareni_telefonski_saobracaj_ka_negeografskim_i_kratkim_kodovima);
        //4.1
        Double VASservis = billingRecordsTelesDao.VASservis();
        model.addAttribute("VASservis", VASservis);
        //4.1.1
        String kod09xx = billingRecordsTelesDao.kod09xx();
        model.addAttribute("kod09xx", kod09xx);
        //4.1.2
        String kod0780 = billingRecordsTelesDao.kod0780();
        model.addAttribute("kod0780", kod0780);
        //4.2
        Double kratki_kodovi = billingRecordsTelesDao.kratki_kodovi();
        model.addAttribute("kratki_kodovi", kratki_kodovi);
        //4.2.1
        String hitne_sluzbe = billingRecordsTelesDao.hitne_sluzbe();
        model.addAttribute("hitne_sluzbe", hitne_sluzbe);
        //4.2.2
        String usluge_od_javnog_interesa = billingRecordsTelesDao.usluge_od_javnog_interesa();
        model.addAttribute("usluge_od_javnog_interesa", usluge_od_javnog_interesa);
        //4.2.3
        String komercijalne_usluge = billingRecordsTelesDao.komercijalne_usluge();
        model.addAttribute("komercijalne_usluge", komercijalne_usluge);
        //4.3
        Double ostale_negeografske_usluge = billingRecordsTelesDao.ostale_negeografske_usluge();
        model.addAttribute("ostale_negeografske_usluge", ostale_negeografske_usluge);
        //4.3.1
        String freephone = billingRecordsTelesDao.freephone();
        model.addAttribute("freephone", freephone);
        //4.3.2
        String univPristupBroju = billingRecordsTelesDao.univPristupBroju();
        model.addAttribute("univPristupBroju", univPristupBroju);
        //4.3.3
        //4.3.4
        String M2M = billingRecordsTelesDao.M2M();
        model.addAttribute("M2M", M2M);
        //4.3.5
        String nomadskaUsluga = billingRecordsTelesDao.nomadskaUsluga();
        model.addAttribute("nomadskaUsluga", nomadskaUsluga);
        //5 (6 + 9)
        //6
        Double medjunarodni_odlazni_telefonski_saobracaj_iz_fiksne_mreze = billingRecordsTelesDao.medjunarodni_odlazni_telefonski_saobracaj_iz_fiksne_mreze();
        model.addAttribute("medjunarodni_odlazni_telefonski_saobracaj_iz_fiksne_mreze", medjunarodni_odlazni_telefonski_saobracaj_iz_fiksne_mreze);
        //7
        String evropa = billingRecordsTelesDao.evropa();
        model.addAttribute("evropa", evropa);
        //8.0
        String ostatak_sveta = billingRecordsTelesDao.ostatak_sveta();
        model.addAttribute("ostatak_sveta", ostatak_sveta);
        //9.0 iz usaglasenih podataka
        //10
        Double broj_medjunarodnih_telegrama = billingRecordsTelesDao.broj_medjunarodnih_telegrama();
        model.addAttribute("broj_medjunarodnih_telegrama", broj_medjunarodnih_telegrama);
        //11
        String prosecna_duzina_razgovora_u_mrezi = billingRecordsTelesDao.prosecna_duzina_razgovora_u_mrezi();
        model.addAttribute("prosecna_duzina_razgovora_u_mrezi", prosecna_duzina_razgovora_u_mrezi);
        //12
        String prosecna_duzina_razgovora_ka_mobilnim_mrezema = billingRecordsTelesDao.prosecna_duzina_razgovora_ka_mobilnim_mrezema();
        model.addAttribute("prosecna_duzina_razgovora_ka_mobilnim_mrezema", prosecna_duzina_razgovora_ka_mobilnim_mrezema);
        //13
        String prosecna_duzina_razgovora_ka_inostranstvu = billingRecordsTelesDao.prosecna_duzina_razgovora_ka_inostranstvu();
        model.addAttribute("prosecna_duzina_razgovora_ka_inostranstvu", prosecna_duzina_razgovora_ka_inostranstvu);
        //14
        Double VoIP_minuti = billingRecordsTelesDao.VoIP_minuti();
        model.addAttribute("VoIP_minuti", VoIP_minuti);
        //15
        String ostvareni_telefonski_saobracaj_u_okviru_sopstvene_mreze = billingRecordsTelesDao.ostvareni_telefonski_saobracaj_u_okviru_sopstvene_mreze();
        model.addAttribute("ostvareni_telefonski_saobracaj_u_okviru_sopstvene_mreze", ostvareni_telefonski_saobracaj_u_okviru_sopstvene_mreze);
        //15.1
        Double ka_geografskim_kodovima = billingRecordsTelesDao.ka_geografskim_kodovima();
        model.addAttribute("ka_geografskim_kodovima", ka_geografskim_kodovima);
        //15.4.1
        String freephoneOduzimanje = billingRecordsTelesDao.freephoneOduzimanje();
        model.addAttribute("freephoneOduzimanje", freephoneOduzimanje);
        //***** TERMINACIJA SAOBRACAJA *****
        String terminacija_iz_drugih_fiksnih_TS = billingRecordsTelesDao.terminacija_iz_drugih_fiksnih_TS();
        model.addAttribute("terminacija_iz_drugih_fiksnih_TS", terminacija_iz_drugih_fiksnih_TS);
         */
        return "RatelIzvestaj";
    }

    @RequestMapping(value = "/rest/{vrsta}")
    @ResponseBody
    public String rest(@PathVariable int vrsta) {

        if (vrsta == 1) {
            System.out.println("usao u if proba");
            String proba = billingRecordsTelesDao.proba();
            System.out.println("zavrsio sa probom idemo dalje");
            return proba;

        }if (vrsta == 2) {
            System.out.println("usao u sledecu");
            String proba = billingRecordsTelesDao.proba();
            return proba;
        }

        return "";
    }

}