package com.example.trackingroad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SearchView;

import java.util.ArrayList;

public class TouristPlace extends AppCompatActivity {

    SearchView search;
    Button bagerhat,bandarban,barguna,barishal,bhola,bogura,brahmanbaria,chandpur,chittagong,chuadanga
            ,comilla,coxBazar, dhaka,dinajpur,faridpur,feni,gaiandha,gazipur,gopalganj,habiganj
            ,jaipurhat,jamalpur,jessore,jhalakathi,jhenaidah,khagrachari,khulna,kishoreganj,kurigram,kushtia
            ,lakshmipur,lalmonirhat,madaripur,magura,manikganj,meherpur,moulvibazar,munshiganj,mymensingh,naogaon
            ,narail,narayanganj,narsinghdi,natore,nawabganj,netrakona,nilphamari,noakhali,pabna
            ,panchagarh,parbattyaChattagram,patuakhali,pirojpur,rajbari,rajshahi,rangpur,sathkhira
            ,shariatpur,sherpur,sirajganj,sunamganj,sylhet,tangail,thakurgaon;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist_place);

        search=(SearchView)findViewById(R.id.searchTouristPlace);

        bagerhat=(Button)findViewById(R.id.bagerhatTourist);
        bandarban=(Button)findViewById(R.id.bandarbanTourist);
        barguna=(Button)findViewById(R.id.bargunaTourist);
        barishal=(Button)findViewById(R.id.barishalTourist);
        bhola=(Button)findViewById(R.id.bholaTourist);
        bogura=(Button)findViewById(R.id.boguraTourist);
        brahmanbaria=(Button)findViewById(R.id.brahmanbariaTourist);
        chandpur=(Button)findViewById(R.id.chandpurTourist);
        chittagong=(Button)findViewById(R.id.chittagongTourist);
        chuadanga=(Button)findViewById(R.id.chuadangaTourist);
        comilla=(Button)findViewById(R.id.comillaTourist);
        coxBazar=(Button)findViewById(R.id.coxsTourist);
        dhaka=(Button)findViewById(R.id.dhakaTourist);
        dinajpur=(Button)findViewById(R.id.dinajpurTourist);
        faridpur=(Button)findViewById(R.id.faridpurTourist);
        feni=(Button)findViewById(R.id.feniTourist);
        gaiandha=(Button)findViewById(R.id.gaibandhaTourist);
        gazipur=(Button)findViewById(R.id.gazipurTourist);
        gopalganj=(Button)findViewById(R.id.gopalganjTourist);
        habiganj=(Button)findViewById(R.id.habiganjTourist);
        jaipurhat=(Button)findViewById(R.id.jaipurhatTourist);
        jamalpur=(Button)findViewById(R.id.jamalpurTourist);
        jessore=(Button)findViewById(R.id.jessoreTourist);
        jhalakathi=(Button)findViewById(R.id.jhalakathiTourist);
        jhenaidah=(Button)findViewById(R.id.jhenaidahTourist);
        khagrachari=(Button)findViewById(R.id.khagrachariTourist);
        khulna=(Button)findViewById(R.id.khulnaTourist);
        kishoreganj=(Button)findViewById(R.id.kishoreganjTourist);
        kurigram=(Button)findViewById(R.id.kurigramTourist);
        kushtia=(Button)findViewById(R.id.kushtiaTourist);
        lakshmipur=(Button)findViewById(R.id.lakshmipurTourist);
        lalmonirhat=(Button)findViewById(R.id.lalmonirhatTourist);
        madaripur=(Button)findViewById(R.id.madaripurTourist);
        magura=(Button)findViewById(R.id.maguraTourist);
        manikganj=(Button)findViewById(R.id.manikganjTourist);
        meherpur=(Button)findViewById(R.id.meherpurTourist);
        moulvibazar=(Button)findViewById(R.id.moulvibazarTourist);
        munshiganj=(Button)findViewById(R.id.munshiganjTourist);
        mymensingh=(Button)findViewById(R.id.mymensinghTourist);
        naogaon=(Button)findViewById(R.id.naogaonTourist);
        narail=(Button)findViewById(R.id.narailTourist);
        narayanganj=(Button)findViewById(R.id.narayanganjTourist);
        narsinghdi=(Button)findViewById(R.id.narsingdiTourist);
        natore=(Button)findViewById(R.id.natoreTourist);
        nawabganj=(Button)findViewById(R.id.nawabganjTourist);
        netrakona=(Button)findViewById(R.id.netrakonaTourist);
        nilphamari=(Button)findViewById(R.id.nilphamariTourist);
        noakhali=(Button)findViewById(R.id.noakhaliTourist);
        pabna=(Button)findViewById(R.id.pabnaTourist);
        panchagarh=(Button)findViewById(R.id.panchagarhTourist);
        parbattyaChattagram=(Button)findViewById(R.id.parbattyaChattagramTourist);
        patuakhali=(Button)findViewById(R.id.patuakhaliTourist);
        pirojpur=(Button)findViewById(R.id.pirojpurTourist);
        rajbari=(Button)findViewById(R.id.rajbariTourist);
        rajshahi=(Button)findViewById(R.id.rajshahiTourist);
        rangpur=(Button)findViewById(R.id.rangpurTourist);
        sathkhira=(Button)findViewById(R.id.satkhiraTourist);
        shariatpur=(Button)findViewById(R.id.shariatpurTourist);
        sherpur=(Button)findViewById(R.id.sherpurTourist);
        sirajganj=(Button)findViewById(R.id.sirajganjTourist);
        sunamganj=(Button)findViewById(R.id.sunamganjTourist);
        sylhet=(Button)findViewById(R.id.sylhetTourist);
        tangail=(Button)findViewById(R.id.tangailTourist);
        thakurgaon=(Button)findViewById(R.id.thakurgaonTourist);

    }
}