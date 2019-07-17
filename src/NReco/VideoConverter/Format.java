package NReco.VideoConverter;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import NReco.VideoConverter.*;

public class Format {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getac3() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("ac3");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setac3(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("ac3", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getaiff() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("aiff");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setaiff(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("aiff", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getalaw() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("alaw");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setalaw(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("alaw", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getasf() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("asf");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setasf(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("asf", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getwmv() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("wmv");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setwmv(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("wmv", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getast() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("ast");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setast(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("ast", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getau() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("au");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setau(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("au", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getavi() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("avi");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setavi(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("avi", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getcaf() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("caf");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setcaf(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("caf", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getdts() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("dts");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setdts(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("dts", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String geteac3() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("eac3");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void seteac3(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("eac3", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getffm() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("ffm");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setffm(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("ffm", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getflac() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("flac");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setflac(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("flac", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getflv() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("flv");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setflv(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("flv", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getgif() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("gif");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setgif(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("gif", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String geth261() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("h261");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void seth261(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("h261", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String geth263() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("h263");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void seth263(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("h263", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String geth264() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("h264");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void seth264(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("h264", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String geth265() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("h265");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void seth265(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("h265", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getmatroska() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("matroska");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setmatroska(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("matroska", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getm4v() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("m4v");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setm4v(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("m4v", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getmjpeg() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("mjpeg");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setmjpeg(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("mjpeg", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getmov() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("mov");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setmov(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("mov", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getmp4() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("mp4");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setmp4(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("mp4", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getmpeg() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("mpeg");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setmpeg(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("mpeg", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getmulaw() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("mulaw");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setmulaw(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("mulaw", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getogg() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("ogg");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setogg(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("ogg", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getoma() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("oma");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setoma(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("oma", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getwebm() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("webm");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setwebm(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("webm", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getraw_data() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("raw_data");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setraw_data(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("raw_data", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getraw_video() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("raw_video");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setraw_video(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("raw_video", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getrm() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("rm");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setrm(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("rm", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getswf() {
    try {
      java.lang.String res = Javonet.getType("NReco.VideoConverter.Format").get("swf");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setswf(java.lang.String param) {
    try {
      Javonet.getType("NReco.VideoConverter.Format").set("swf", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Format() {
    try {
      javonetHandle = Javonet.New("NReco.VideoConverter.Format");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Format(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
