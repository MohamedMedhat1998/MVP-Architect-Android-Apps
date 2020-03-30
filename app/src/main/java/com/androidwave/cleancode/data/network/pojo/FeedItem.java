
package com.androidwave.cleancode.data.network.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FeedItem {

    /**
     * get : statistics
     * parameters : []
     * errors : []
     * results : 206
     * response : [{"country":"China","cases":{"new":"+31","active":2466,"critical":633,"recovered":75700,"total":81470},"deaths":{"new":"+4","total":3304},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Italy","cases":{"new":"+5217","active":73880,"critical":3906,"recovered":13030,"total":97689},"deaths":{"new":"+756","total":10779},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Spain","cases":{"new":"+6875","active":58598,"critical":4165,"recovered":14709,"total":80110},"deaths":{"new":"+821","total":6803},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"USA","cases":{"new":"+275","active":135684,"critical":2970,"recovered":4562,"total":142735},"deaths":{"new":"+5","total":2489},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Germany","cases":{"new":"+4740","active":52683,"critical":1979,"recovered":9211,"total":62435},"deaths":{"new":"+108","total":541},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Iran","cases":{"new":"+2901","active":23278,"critical":3206,"recovered":12391,"total":38309},"deaths":{"new":"+123","total":2640},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"France","cases":{"new":"+2599","active":30366,"critical":4632,"recovered":7202,"total":40174},"deaths":{"new":"+292","total":2606},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"S.-Korea","cases":{"new":"+78","active":4275,"critical":59,"recovered":5228,"total":9661},"deaths":{"new":"+6","total":158},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Switzerland","cases":{"new":"+753","active":12934,"critical":301,"recovered":1595,"total":14829},"deaths":{"new":"+36","total":300},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"UK","cases":{"new":"+2433","active":18159,"critical":163,"recovered":135,"total":19522},"deaths":{"new":"+209","total":1228},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Netherlands","cases":{"new":"+1104","active":9845,"critical":972,"recovered":250,"total":10866},"deaths":{"new":"+132","total":771},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Austria","cases":{"new":"+170","active":8393,"critical":187,"recovered":479,"total":8958},"deaths":{"new":null,"total":86},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Belgium","cases":{"new":"+1702","active":9046,"critical":867,"recovered":1359,"total":10836},"deaths":{"new":"+78","total":431},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Norway","cases":{"new":"+21","active":4272,"critical":91,"recovered":7,"total":4305},"deaths":{"new":null,"total":26},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Sweden","cases":{"new":null,"active":3574,"critical":281,"recovered":16,"total":3700},"deaths":{"new":null,"total":110},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Canada","cases":{"new":"+665","active":5682,"critical":120,"recovered":573,"total":6320},"deaths":{"new":"+5","total":65},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Denmark","cases":{"new":"+194","active":2322,"critical":113,"recovered":1,"total":2395},"deaths":{"new":"+7","total":72},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Portugal","cases":{"new":"+792","active":5800,"critical":89,"recovered":43,"total":5962},"deaths":{"new":"+19","total":119},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Malaysia","cases":{"new":"+150","active":2047,"critical":73,"recovered":388,"total":2470},"deaths":{"new":"+8","total":35},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Brazil","cases":{"new":"+352","active":4114,"critical":296,"recovered":6,"total":4256},"deaths":{"new":"+22","total":136},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Australia","cases":{"new":null,"active":3901,"critical":28,"recovered":244,"total":4163},"deaths":{"new":"+1","total":18},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Japan","cases":{"new":"+173","active":1388,"critical":56,"recovered":424,"total":1866},"deaths":{"new":"+2","total":54},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Czechia","cases":{"new":"+20","active":2809,"critical":45,"recovered":11,"total":2837},"deaths":{"new":"+1","total":17},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Turkey","cases":{"new":"+1815","active":8981,"critical":568,"recovered":105,"total":9217},"deaths":{"new":"+23","total":131},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Israel","cases":{"new":"+100","active":4198,"critical":80,"recovered":134,"total":4347},"deaths":{"new":null,"total":15},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Ireland","cases":{"new":"+200","active":2564,"critical":59,"recovered":5,"total":2615},"deaths":{"new":"+10","total":46},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Diamond-Princess-","cases":{"new":null,"active":99,"critical":15,"recovered":603,"total":712},"deaths":{"new":null,"total":10},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Luxembourg","cases":{"new":"+119","active":1889,"critical":25,"recovered":40,"total":1950},"deaths":{"new":"+3","total":21},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Pakistan","cases":{"new":"+28","active":1578,"critical":11,"recovered":29,"total":1625},"deaths":{"new":"+4","total":18},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Chile","cases":{"new":"+230","active":2057,"critical":7,"recovered":75,"total":2139},"deaths":{"new":"+1","total":7},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Poland","cases":{"new":"+43","active":1872,"critical":3,"recovered":7,"total":1905},"deaths":{"new":"+4","total":26},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Ecuador","cases":{"new":"+101","active":1863,"critical":58,"recovered":3,"total":1924},"deaths":{"new":"+10","total":58},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Greece","cases":{"new":"+95","active":1065,"critical":66,"recovered":52,"total":1156},"deaths":{"new":"+7","total":39},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Finland","cases":{"new":"+46","active":1265,"critical":32,"recovered":10,"total":1286},"deaths":{"new":null,"total":11},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Qatar","cases":{"new":"+44","active":585,"critical":6,"recovered":48,"total":634},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Iceland","cases":{"new":"+57","active":883,"critical":25,"recovered":135,"total":1020},"deaths":{"new":null,"total":2},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Indonesia","cases":{"new":"+130","active":1107,"critical":0,"recovered":64,"total":1285},"deaths":{"new":"+12","total":114},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Singapore","cases":{"new":"+42","active":629,"critical":19,"recovered":212,"total":844},"deaths":{"new":"+1","total":3},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Thailand","cases":{"new":"+136","active":1288,"critical":11,"recovered":229,"total":1524},"deaths":{"new":null,"total":7},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Saudi-Arabia","cases":{"new":"+96","active":1225,"critical":12,"recovered":66,"total":1299},"deaths":{"new":"+4","total":8},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Slovenia","cases":{"new":"+46","active":709,"critical":23,"recovered":10,"total":730},"deaths":{"new":"+2","total":11},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Romania","cases":{"new":"+363","active":1566,"critical":31,"recovered":206,"total":1815},"deaths":{"new":"+6","total":43},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"India","cases":{"new":"+47","active":942,"critical":0,"recovered":100,"total":1071},"deaths":{"new":"+2","total":29},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Peru","cases":{"new":"+181","active":818,"critical":40,"recovered":16,"total":852},"deaths":{"new":"+2","total":18},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Bahrain","cases":{"new":"+16","active":232,"critical":2,"recovered":279,"total":515},"deaths":{"new":null,"total":4},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Philippines","cases":{"new":"+343","active":1305,"critical":1,"recovered":42,"total":1418},"deaths":{"new":"+3","total":71},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Russia","cases":{"new":"+270","active":1462,"critical":8,"recovered":64,"total":1534},"deaths":{"new":"+4","total":8},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Estonia","cases":{"new":"+36","active":692,"critical":10,"recovered":20,"total":715},"deaths":{"new":null,"total":3},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Egypt","cases":{"new":"+33","active":437,"critical":0,"recovered":132,"total":609},"deaths":{"new":"+4","total":40},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Hong-Kong","cases":{"new":"+82","active":520,"critical":5,"recovered":118,"total":642},"deaths":{"new":null,"total":4},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"South-Africa","cases":{"new":"+93","active":1247,"critical":7,"recovered":31,"total":1280},"deaths":{"new":"+1","total":2},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Lebanon","cases":{"new":"+26","active":398,"critical":4,"recovered":30,"total":438},"deaths":{"new":"+2","total":10},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Iraq","cases":{"new":"+41","active":362,"critical":0,"recovered":143,"total":547},"deaths":{"new":null,"total":42},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Croatia","cases":{"new":"+56","active":652,"critical":26,"recovered":55,"total":713},"deaths":{"new":"+1","total":6},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Mexico","cases":{"new":"+145","active":938,"critical":1,"recovered":35,"total":993},"deaths":{"new":"+4","total":20},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Panama","cases":{"new":"+88","active":961,"critical":36,"recovered":4,"total":989},"deaths":{"new":"+7","total":24},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Colombia","cases":{"new":"+94","active":682,"critical":29,"recovered":10,"total":702},"deaths":{"new":"+4","total":10},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Slovakia","cases":{"new":"+22","active":312,"critical":1,"recovered":2,"total":314},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Kuwait","cases":{"new":"+20","active":188,"critical":12,"recovered":67,"total":255},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Serbia","cases":{"new":"+82","active":686,"critical":25,"recovered":42,"total":741},"deaths":{"new":"+3","total":13},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Bulgaria","cases":{"new":"+8","active":331,"critical":13,"recovered":15,"total":354},"deaths":{"new":null,"total":8},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"San-Marino","cases":{"new":"+1","active":196,"critical":16,"recovered":6,"total":224},"deaths":{"new":"+1","total":22},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Armenia","cases":{"new":"+17","active":391,"critical":6,"recovered":30,"total":424},"deaths":{"new":"+2","total":3},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Argentina","cases":{"new":"+75","active":709,"critical":0,"recovered":91,"total":820},"deaths":{"new":"+1","total":20},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Taiwan","cases":{"new":"+15","active":256,"critical":0,"recovered":39,"total":298},"deaths":{"new":"+1","total":3},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"UAE","cases":{"new":"+102","active":509,"critical":2,"recovered":58,"total":570},"deaths":{"new":"+1","total":3},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Algeria","cases":{"new":"+57","active":449,"critical":0,"recovered":31,"total":511},"deaths":{"new":"+2","total":31},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Latvia","cases":{"new":"+29","active":375,"critical":3,"recovered":1,"total":376},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Costa-Rica","cases":{"new":"+19","active":309,"critical":6,"recovered":3,"total":314},"deaths":{"new":null,"total":2},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Dominican-Republic","cases":{"new":"+140","active":817,"critical":0,"recovered":3,"total":859},"deaths":{"new":"+11","total":39},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Uruguay","cases":{"new":"+66","active":303,"critical":9,"recovered":0,"total":304},"deaths":{"new":"+1","total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Hungary","cases":{"new":"+39","active":398,"critical":6,"recovered":34,"total":447},"deaths":{"new":"+2","total":15},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Jordan","cases":{"new":"+13","active":238,"critical":3,"recovered":18,"total":259},"deaths":{"new":"+2","total":3},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Lithuania","cases":{"new":"+24","active":476,"critical":2,"recovered":1,"total":484},"deaths":{"new":null,"total":7},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Morocco","cases":{"new":"+37","active":476,"critical":1,"recovered":13,"total":516},"deaths":{"new":"+1","total":27},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Vietnam","cases":{"new":null,"active":142,"critical":3,"recovered":52,"total":194},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Bosnia-and-Herzegovina","cases":{"new":"+17","active":326,"critical":1,"recovered":8,"total":340},"deaths":{"new":null,"total":6},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Faeroe-Islands","cases":{"new":"+4","active":89,"critical":1,"recovered":70,"total":159},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Andorra","cases":{"new":null,"active":322,"critical":10,"recovered":6,"total":334},"deaths":{"new":null,"total":6},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"North-Macedonia","cases":{"new":"+18","active":250,"critical":1,"recovered":3,"total":259},"deaths":{"new":"+2","total":6},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Cyprus","cases":{"new":"+35","active":193,"critical":3,"recovered":15,"total":214},"deaths":{"new":"+1","total":6},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Brunei-","cases":{"new":"+6","active":91,"critical":1,"recovered":34,"total":126},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Moldova","cases":{"new":null,"active":248,"critical":33,"recovered":13,"total":263},"deaths":{"new":null,"total":2},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Sri-Lanka","cases":{"new":"+3","active":108,"critical":5,"recovered":11,"total":120},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Albania","cases":{"new":"+15","active":169,"critical":3,"recovered":33,"total":212},"deaths":{"new":null,"total":10},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Belarus","cases":{"new":"+8","active":62,"critical":2,"recovered":32,"total":94},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Malta","cases":{"new":"+2","active":149,"critical":4,"recovered":2,"total":151},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Venezuela","cases":{"new":null,"active":77,"critical":6,"recovered":39,"total":119},"deaths":{"new":"+1","total":3},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Burkina-Faso","cases":{"new":"+15","active":187,"critical":0,"recovered":23,"total":222},"deaths":{"new":"+1","total":12},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Tunisia","cases":{"new":"+34","active":302,"critical":10,"recovered":2,"total":312},"deaths":{"new":null,"total":8},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Guadeloupe","cases":{"new":"+4","active":85,"critical":10,"recovered":17,"total":106},"deaths":{"new":"+2","total":4},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Senegal","cases":{"new":"+12","active":115,"critical":0,"recovered":27,"total":142},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Kazakhstan","cases":{"new":"+9","active":272,"critical":0,"recovered":20,"total":293},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Azerbaijan","cases":{"new":"+27","active":190,"critical":23,"recovered":15,"total":209},"deaths":{"new":null,"total":4},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Cambodia","cases":{"new":"+4","active":82,"critical":1,"recovered":21,"total":103},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Palestine","cases":{"new":"+5","active":90,"critical":0,"recovered":18,"total":109},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"New-Zealand","cases":{"new":"+75","active":525,"critical":2,"recovered":63,"total":589},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Oman","cases":{"new":"+15","active":144,"critical":3,"recovered":23,"total":167},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Georgia","cases":{"new":"+7","active":80,"critical":1,"recovered":18,"total":98},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Trinidad-and-Tobago","cases":{"new":"+2","active":74,"critical":0,"recovered":1,"total":78},"deaths":{"new":null,"total":3},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Ukraine","cases":{"new":"+119","active":459,"critical":0,"recovered":6,"total":475},"deaths":{"new":"+1","total":10},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"R&eacute;union","cases":{"new":"+38","active":182,"critical":0,"recovered":1,"total":183},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Uzbekistan","cases":{"new":"+40","active":135,"critical":8,"recovered":7,"total":144},"deaths":{"new":null,"total":2},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Cameroon","cases":{"new":"+48","active":128,"critical":0,"recovered":5,"total":139},"deaths":{"new":"+4","total":6},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Martinique","cases":{"new":null,"active":92,"critical":12,"recovered":0,"total":93},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Liechtenstein","cases":{"new":"+5","active":56,"critical":0,"recovered":0,"total":56},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Channel-Islands","cases":{"new":"+11","active":106,"critical":0,"recovered":0,"total":108},"deaths":{"new":"+1","total":2},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Bangladesh","cases":{"new":"+1","active":25,"critical":1,"recovered":19,"total":49},"deaths":{"new":null,"total":5},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Afghanistan","cases":{"new":"+10","active":114,"critical":0,"recovered":2,"total":120},"deaths":{"new":null,"total":4},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Honduras","cases":{"new":"+29","active":133,"critical":4,"recovered":3,"total":139},"deaths":{"new":null,"total":3},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"DRC","cases":{"new":"+16","active":71,"critical":0,"recovered":2,"total":81},"deaths":{"new":"+2","total":8},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Nigeria","cases":{"new":"+14","active":107,"critical":0,"recovered":3,"total":111},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Cuba","cases":{"new":"+20","active":132,"critical":2,"recovered":4,"total":139},"deaths":{"new":null,"total":3},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Ghana","cases":{"new":"+11","active":145,"critical":1,"recovered":2,"total":152},"deaths":{"new":null,"total":5},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Puerto-Rico","cases":{"new":"+8","active":36,"critical":0,"recovered":1,"total":39},"deaths":{"new":null,"total":2},"day":"2020-03-25","time":"2020-03-25T06:00:07+00:00"},{"country":"Jamaica","cases":{"new":"+2","active":29,"critical":0,"recovered":2,"total":32},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Bolivia","cases":{"new":"+15","active":95,"critical":3,"recovered":0,"total":96},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Guyana","cases":{"new":"+3","active":7,"critical":0,"recovered":0,"total":8},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Paraguay","cases":{"new":"+5","active":60,"critical":3,"recovered":1,"total":64},"deaths":{"new":null,"total":3},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Macao","cases":{"new":"+3","active":27,"critical":0,"recovered":10,"total":37},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Monaco","cases":{"new":"+3","active":44,"critical":0,"recovered":1,"total":46},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"French-Guiana","cases":{"new":"+15","active":37,"critical":0,"recovered":6,"total":43},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Guatemala","cases":{"new":"+6","active":23,"critical":1,"recovered":10,"total":34},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Rwanda","cases":{"new":"+10","active":70,"critical":0,"recovered":0,"total":70},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Montenegro","cases":{"new":"+6","active":90,"critical":1,"recovered":0,"total":91},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Togo","cases":{"new":"+5","active":28,"critical":0,"recovered":1,"total":30},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"French-Polynesia","cases":{"new":"+5","active":30,"critical":0,"recovered":0,"total":30},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Guam","cases":{"new":"+3","active":31,"critical":0,"recovered":0,"total":32},"deaths":{"new":null,"total":1},"day":"2020-03-25","time":"2020-03-25T06:00:07+00:00"},{"country":"Mauritius","cases":{"new":"+3","active":107,"critical":1,"recovered":0,"total":110},"deaths":{"new":null,"total":3},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Barbados","cases":{"new":"+7","active":33,"critical":0,"recovered":0,"total":33},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Ivory-Coast","cases":{"new":"+64","active":160,"critical":0,"recovered":4,"total":165},"deaths":{"new":"+1","total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Kyrgyzstan","cases":{"new":"+26","active":84,"critical":0,"recovered":0,"total":84},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Maldives","cases":{"new":"+1","active":4,"critical":0,"recovered":13,"total":17},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Mayotte","cases":{"new":"+13","active":63,"critical":0,"recovered":0,"total":63},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Gibraltar","cases":{"new":"+9","active":51,"critical":0,"recovered":14,"total":65},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Mongolia","cases":{"new":null,"active":10,"critical":0,"recovered":2,"total":12},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Ethiopia","cases":{"new":"+5","active":20,"critical":0,"recovered":1,"total":21},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Kenya","cases":{"new":"+4","active":40,"critical":2,"recovered":1,"total":42},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Seychelles","cases":{"new":"+1","active":8,"critical":0,"recovered":0,"total":8},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Equatorial-Guinea","cases":{"new":"+3","active":12,"critical":0,"recovered":0,"total":12},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Tanzania","cases":{"new":"+1","active":13,"critical":0,"recovered":1,"total":14},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"U.S.-Virgin-Islands","cases":{"new":"+11","active":17,"critical":0,"recovered":0,"total":17},"deaths":{"new":null,"total":0},"day":"2020-03-25","time":"2020-03-25T06:00:07+00:00"},{"country":"Gabon","cases":{"new":"+1","active":6,"critical":0,"recovered":0,"total":7},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Aruba","cases":{"new":"+4","active":49,"critical":0,"recovered":1,"total":50},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Saint-Martin","cases":{"new":"+3","active":11,"critical":0,"recovered":0,"total":11},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Suriname","cases":{"new":"+1","active":8,"critical":0,"recovered":0,"total":8},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Bahamas","cases":{"new":"+4","active":13,"critical":0,"recovered":1,"total":14},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"New-Caledonia","cases":{"new":"+1","active":15,"critical":0,"recovered":0,"total":15},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Cayman-Islands","cases":{"new":"+4","active":11,"critical":0,"recovered":0,"total":12},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Cura&ccedil;ao","cases":{"new":"+1","active":5,"critical":0,"recovered":2,"total":8},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Cabo-Verde","cases":{"new":"+1","active":5,"critical":0,"recovered":0,"total":6},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"CAR","cases":{"new":null,"active":3,"critical":0,"recovered":0,"total":3},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Congo","cases":{"new":"+15","active":19,"critical":0,"recovered":0,"total":19},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"El-Salvador","cases":{"new":"+6","active":30,"critical":0,"recovered":0,"total":30},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Liberia","cases":{"new":null,"active":3,"critical":0,"recovered":0,"total":3},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Madagascar","cases":{"new":"+13","active":39,"critical":0,"recovered":0,"total":39},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Namibia","cases":{"new":"+3","active":9,"critical":0,"recovered":2,"total":11},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"St.-Barth","cases":{"new":"+2","active":5,"critical":0,"recovered":0,"total":5},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Zimbabwe","cases":{"new":"+2","active":6,"critical":0,"recovered":0,"total":7},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Sudan","cases":{"new":"+1","active":5,"critical":0,"recovered":0,"total":6},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Angola","cases":{"new":"+2","active":5,"critical":0,"recovered":0,"total":7},"deaths":{"new":"+2","total":2},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Benin","cases":{"new":"+4","active":6,"critical":0,"recovered":0,"total":6},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Bermuda","cases":{"new":"+5","active":20,"critical":0,"recovered":2,"total":22},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Bhutan","cases":{"new":"+1","active":4,"critical":0,"recovered":0,"total":4},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Fiji","cases":{"new":"+1","active":5,"critical":0,"recovered":0,"total":5},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Greenland","cases":{"new":"+4","active":8,"critical":0,"recovered":2,"total":10},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Guinea","cases":{"new":"+8","active":16,"critical":0,"recovered":0,"total":16},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Haiti","cases":{"new":"+7","active":14,"critical":0,"recovered":1,"total":15},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Isle-of-Man","cases":{"new":"+10","active":42,"critical":0,"recovered":0,"total":42},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Mauritania","cases":{"new":null,"active":3,"critical":0,"recovered":2,"total":5},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Nicaragua","cases":{"new":null,"active":3,"critical":0,"recovered":0,"total":4},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Saint-Lucia","cases":{"new":"+6","active":8,"critical":0,"recovered":1,"total":9},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Zambia","cases":{"new":"+1","active":29,"critical":0,"recovered":0,"total":29},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Nepal","cases":{"new":"+1","active":4,"critical":0,"recovered":1,"total":5},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Antigua-and-Barbuda","cases":{"new":"+4","active":7,"critical":0,"recovered":0,"total":7},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Chad","cases":{"new":"+1","active":3,"critical":0,"recovered":0,"total":3},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Djibouti","cases":{"new":"+4","active":18,"critical":0,"recovered":0,"total":18},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Eritrea","cases":{"new":"+6","active":12,"critical":0,"recovered":0,"total":12},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Gambia","cases":{"new":"+1","active":3,"critical":0,"recovered":0,"total":4},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Vatican-City","cases":{"new":"+2","active":6,"critical":0,"recovered":0,"total":6},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Montserrat","cases":{"new":"+4","active":5,"critical":0,"recovered":0,"total":5},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Niger","cases":{"new":"+8","active":17,"critical":0,"recovered":0,"total":18},"deaths":{"new":null,"total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Papua-New-Guinea","cases":{"new":null,"active":1,"critical":0,"recovered":0,"total":1},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"St.-Vincent-Grenadines","cases":{"new":null,"active":0,"critical":0,"recovered":1,"total":1},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Sint-Maarten","cases":{"new":null,"active":6,"critical":0,"recovered":0,"total":6},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Somalia","cases":{"new":"+1","active":3,"critical":0,"recovered":0,"total":3},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Eswatini","cases":{"new":"+3","active":9,"critical":0,"recovered":0,"total":9},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Timor-Leste","cases":{"new":null,"active":1,"critical":0,"recovered":0,"total":1},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Uganda","cases":{"new":"+3","active":33,"critical":0,"recovered":0,"total":33},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"All","cases":{"new":"+1510","active":538036,"critical":26719,"recovered":151833,"total":723869},"deaths":{"new":"+34","total":34000},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Mozambique","cases":{"new":"+1","active":8,"critical":0,"recovered":0,"total":8},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Syria","cases":{"new":"+4","active":8,"critical":0,"recovered":0,"total":9},"deaths":{"new":"+1","total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Grenada","cases":{"new":"+2","active":9,"critical":0,"recovered":0,"total":9},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Dominica","cases":{"new":"+4","active":11,"critical":0,"recovered":0,"total":11},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Turks-and-Caicos","cases":{"new":"+2","active":4,"critical":0,"recovered":0,"total":4},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Belize","cases":{"new":"+1","active":2,"critical":0,"recovered":0,"total":2},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Myanmar","cases":{"new":"+2","active":10,"critical":0,"recovered":0,"total":10},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Laos","cases":{"new":"+2","active":8,"critical":0,"recovered":0,"total":8},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Libya","cases":{"new":"+5","active":8,"critical":0,"recovered":0,"total":8},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Mali","cases":{"new":"+7","active":17,"critical":0,"recovered":0,"total":18},"deaths":{"new":"+1","total":1},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Guinea-Bissau","cases":{"new":"+2","active":2,"critical":0,"recovered":0,"total":2},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"British-Virgin-Islands","cases":{"new":"+2","active":2,"critical":0,"recovered":0,"total":2},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Saint-Kitts-and-Nevis","cases":{"new":"+2","active":2,"critical":0,"recovered":0,"total":2},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"Anguilla","cases":{"new":"+2","active":2,"critical":0,"recovered":0,"total":2},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"MS-Zaandam-","cases":{"new":"+2","active":2,"critical":0,"recovered":0,"total":2},"deaths":{"new":null,"total":0},"day":"2020-03-30","time":"2020-03-30T08:15:10+00:00"},{"country":"MS-Zaandam","cases":{"new":"+2","active":2,"critical":0,"recovered":0,"total":2},"deaths":{"new":null,"total":0},"day":"2020-03-28","time":"2020-03-28T02:30:04+00:00"}]
     */

    @SerializedName("get")
    private String get;
    @SerializedName("results")
    private int results;
    @SerializedName("parameters")
    private List<?> parameters;
    @SerializedName("errors")
    private List<?> errors;
    @SerializedName("response")
    private List<ResponseBean> response;

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public int getResults() {
        return results;
    }

    public void setResults(int results) {
        this.results = results;
    }

    public List<?> getParameters() {
        return parameters;
    }

    public void setParameters(List<?> parameters) {
        this.parameters = parameters;
    }

    public List<?> getErrors() {
        return errors;
    }

    public void setErrors(List<?> errors) {
        this.errors = errors;
    }

    public List<ResponseBean> getResponse() {
        return response;
    }

    public void setResponse(List<ResponseBean> response) {
        this.response = response;
    }

    public static class ResponseBean {
        /**
         * country : China
         * cases : {"new":"+31","active":2466,"critical":633,"recovered":75700,"total":81470}
         * deaths : {"new":"+4","total":3304}
         * day : 2020-03-30
         * time : 2020-03-30T08:15:10+00:00
         */

        @SerializedName("country")
        private String country;
        @SerializedName("cases")
        private CasesBean cases;
        @SerializedName("deaths")
        private DeathsBean deaths;
        @SerializedName("day")
        private String day;
        @SerializedName("time")
        private String time;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public CasesBean getCases() {
            return cases;
        }

        public void setCases(CasesBean cases) {
            this.cases = cases;
        }

        public DeathsBean getDeaths() {
            return deaths;
        }

        public void setDeaths(DeathsBean deaths) {
            this.deaths = deaths;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public static class CasesBean {
            /**
             * new : +31
             * active : 2466
             * critical : 633
             * recovered : 75700
             * total : 81470
             */

            @SerializedName("new")
            private String newX;
            @SerializedName("active")
            private int active;
            @SerializedName("critical")
            private int critical;
            @SerializedName("recovered")
            private int recovered;
            @SerializedName("total")
            private int total;

            public String getNewX() {
                return newX;
            }

            public void setNewX(String newX) {
                this.newX = newX;
            }

            public int getActive() {
                return active;
            }

            public void setActive(int active) {
                this.active = active;
            }

            public int getCritical() {
                return critical;
            }

            public void setCritical(int critical) {
                this.critical = critical;
            }

            public int getRecovered() {
                return recovered;
            }

            public void setRecovered(int recovered) {
                this.recovered = recovered;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }
        }

        public static class DeathsBean {
            /**
             * new : +4
             * total : 3304
             */

            @SerializedName("new")
            private String newX;
            @SerializedName("total")
            private int total;

            public String getNewX() {
                return newX;
            }

            public void setNewX(String newX) {
                this.newX = newX;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }
        }

        public SimplifiedFeedItem getSimplifiedFeedItem(String flagLink){
            return new SimplifiedFeedItem(country,cases.total,deaths.total,cases.recovered,flagLink);
        }
    }
}
