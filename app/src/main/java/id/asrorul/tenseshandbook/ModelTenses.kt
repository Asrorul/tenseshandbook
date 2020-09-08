package id.asrorul.tenseshandbook
import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable

class ModelTenses() : Serializable {
    var tentang: String = ""
    var katasinyal: String = ""
    var tenses:String=""
    var photo: Int=0

    var rumuspositifverbal: String = ""
    var rumuspositifnominal:String=""
    var examplepositifverbal: String = ""
    var examplepositifnominal: String = ""

    var rumusnegativverbal: String = ""
    var rumusnegativnominal:String=""
    var examplenegativverbal: String = ""
    var examplenegativnominal: String = ""

    var rumustanyaverbal: String = ""
    var rumustanyanominal:String=""
    var exampletanyaverbal: String = ""
    var exampletanyanominal: String = ""

//    constructor(parcel: Parcel) : this() {
//        tentang = parcel.readString()!!
//        katasinyal = parcel.readString()!!
//        tenses = parcel.readString()!!
//        indextenses = parcel.readInt()
//        rumuspositifverbal = parcel.readString()!!
//        rumuspositifnominal = parcel.readString()!!
//        examplepositifverbal = parcel.readString()!!
//        examplepositifnominal = parcel.readString()!!
//        rumusnegativverbal = parcel.readString()!!
//        rumusnegativnominal = parcel.readString()!!
//        examplenegativverbal = parcel.readString()!!
//        examplenegativnominal = parcel.readString()!!
//        rumustanyaverbal = parcel.readString()!!
//        rumustanyanominal = parcel.readString()!!
//        exampletanyaverbal = parcel.readString()!!
//        exampletanyanominal = parcel.readString()!!
//    }
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeString(tentang)
//        parcel.writeString(katasinyal)
//        parcel.writeString(tenses)
//        parcel.writeInt(indextenses)
//        parcel.writeString(rumuspositifverbal)
//        parcel.writeString(rumuspositifnominal)
//        parcel.writeString(examplepositifverbal)
//        parcel.writeString(examplepositifnominal)
//        parcel.writeString(rumusnegativverbal)
//        parcel.writeString(rumusnegativnominal)
//        parcel.writeString(examplenegativverbal)
//        parcel.writeString(examplenegativnominal)
//        parcel.writeString(rumustanyaverbal)
//        parcel.writeString(rumustanyanominal)
//        parcel.writeString(exampletanyaverbal)
//        parcel.writeString(exampletanyanominal)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<ModelTenses> {
//        override fun createFromParcel(parcel: Parcel): ModelTenses {
//            return ModelTenses(parcel)
//        }
//
//        override fun newArray(size: Int): Array<ModelTenses?> {
//            return arrayOfNulls(size)
//        }
//    }


}