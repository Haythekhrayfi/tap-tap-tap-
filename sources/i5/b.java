package i5;

import android.util.Base64;
import android.util.JsonReader;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.exoplayer2.b.z;
import com.applovin.sdk.AppLovinEventTypes;
import h5.a0;
import h5.b0;
import h5.c;
import h5.g;
import h5.h;
import h5.j;
import h5.k;
import h5.l;
import h5.m;
import h5.o;
import h5.p;
import h5.r;
import h5.s;
import h5.t;
import h5.u;
import h5.v;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Objects;
import s5.d;
import s5.e;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q5.a f31272a;

    public interface a<T> {
        T c(JsonReader jsonReader) throws IOException;
    }

    static {
        e eVar = new e();
        ((h5.a) h5.a.f30593a).configure(eVar);
        eVar.f35465d = true;
        f31272a = new d(eVar);
    }

    public static a0.e.d.a.b.AbstractC0294e.AbstractC0296b a(JsonReader jsonReader) throws IOException {
        r.b bVar = new r.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Objects.requireNonNull(strNextName);
            switch (strNextName) {
                case "offset":
                    bVar.f30879d = Long.valueOf(jsonReader.nextLong());
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    Objects.requireNonNull(strNextString, "Null symbol");
                    bVar.f30877b = strNextString;
                    break;
                case "pc":
                    bVar.f30876a = Long.valueOf(jsonReader.nextLong());
                    break;
                case "file":
                    bVar.f30878c = jsonReader.nextString();
                    break;
                case "importance":
                    bVar.f30880e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    public static a0.c b(JsonReader jsonReader) throws IOException {
        h5.d.b bVar = new h5.d.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Objects.requireNonNull(strNextName);
            if (strNextName.equals(Action.KEY_ATTRIBUTE)) {
                String strNextString = jsonReader.nextString();
                Objects.requireNonNull(strNextString, "Null key");
                bVar.f30748a = strNextString;
            } else if (strNextName.equals("value")) {
                String strNextString2 = jsonReader.nextString();
                Objects.requireNonNull(strNextString2, "Null value");
                bVar.f30749b = strNextString2;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    public static <T> b0<T> c(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.c(jsonReader));
        }
        jsonReader.endArray();
        return new b0<>(arrayList);
    }

    public static a0.e.d d(JsonReader jsonReader) throws IOException {
        k.b bVar = new k.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Objects.requireNonNull(strNextName);
            switch (strNextName) {
                case "device":
                    s.b bVar2 = new s.b();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        Objects.requireNonNull(strNextName2);
                        switch (strNextName2) {
                            case "batteryLevel":
                                bVar2.f30887a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                bVar2.f30888b = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "orientation":
                                bVar2.f30890d = Integer.valueOf(jsonReader.nextInt());
                                break;
                            case "diskUsed":
                                bVar2.f30892f = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "ramUsed":
                                bVar2.f30891e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "proximityOn":
                                bVar2.f30889c = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    bVar.d(bVar2.a());
                    break;
                case "app":
                    l.b bVar3 = new l.b();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        Objects.requireNonNull(strNextName3);
                        switch (strNextName3) {
                            case "background":
                                bVar3.f30829d = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case "execution":
                                m.b bVar4 = new m.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    Objects.requireNonNull(strNextName4);
                                    switch (strNextName4) {
                                        case "appExitInfo":
                                            c.b bVar5 = new c.b();
                                            jsonReader.beginObject();
                                            while (jsonReader.hasNext()) {
                                                String strNextName5 = jsonReader.nextName();
                                                Objects.requireNonNull(strNextName5);
                                                switch (strNextName5) {
                                                    case "pid":
                                                        bVar5.f30738a = Integer.valueOf(jsonReader.nextInt());
                                                        break;
                                                    case "pss":
                                                        bVar5.f30742e = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "rss":
                                                        bVar5.f30743f = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "timestamp":
                                                        bVar5.f30744g = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "processName":
                                                        String strNextString = jsonReader.nextString();
                                                        Objects.requireNonNull(strNextString, "Null processName");
                                                        bVar5.f30739b = strNextString;
                                                        break;
                                                    case "reasonCode":
                                                        bVar5.f30740c = Integer.valueOf(jsonReader.nextInt());
                                                        break;
                                                    case "traceFile":
                                                        bVar5.f30745h = jsonReader.nextString();
                                                        break;
                                                    case "importance":
                                                        bVar5.f30741d = Integer.valueOf(jsonReader.nextInt());
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            bVar4.f30838c = bVar5.a();
                                            break;
                                        case "threads":
                                            bVar4.f30836a = c(jsonReader, i5.a.f31249e);
                                            break;
                                        case "signal":
                                            p.b bVar6 = new p.b();
                                            jsonReader.beginObject();
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                Objects.requireNonNull(strNextName6);
                                                switch (strNextName6) {
                                                    case "address":
                                                        bVar6.f30864c = Long.valueOf(jsonReader.nextLong());
                                                        break;
                                                    case "code":
                                                        String strNextString2 = jsonReader.nextString();
                                                        Objects.requireNonNull(strNextString2, "Null code");
                                                        bVar6.f30863b = strNextString2;
                                                        break;
                                                    case "name":
                                                        String strNextString3 = jsonReader.nextString();
                                                        Objects.requireNonNull(strNextString3, "Null name");
                                                        bVar6.f30862a = strNextString3;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            bVar4.c(bVar6.a());
                                            break;
                                        case "binaries":
                                            bVar4.b(c(jsonReader, z.f4669y));
                                            break;
                                        case "exception":
                                            bVar4.f30837b = e(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                bVar3.d(bVar4.a());
                                break;
                            case "internalKeys":
                                bVar3.f30828c = c(jsonReader, z.f4667w);
                                break;
                            case "customAttributes":
                                bVar3.f30827b = c(jsonReader, com.applovin.exoplayer2.a.p.G);
                                break;
                            case "uiOrientation":
                                bVar3.e(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    bVar.b(bVar3.a());
                    break;
                case "log":
                    t.b bVar7 = new t.b();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName7 = jsonReader.nextName();
                        Objects.requireNonNull(strNextName7);
                        if (strNextName7.equals(AppLovinEventTypes.USER_VIEWED_CONTENT)) {
                            String strNextString4 = jsonReader.nextString();
                            Objects.requireNonNull(strNextString4, "Null content");
                            bVar7.f30894a = strNextString4;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    bVar.f30820e = bVar7.a();
                    break;
                case "type":
                    bVar.f(jsonReader.nextString());
                    break;
                case "timestamp":
                    bVar.e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    public static a0.e.d.a.b.c e(JsonReader jsonReader) throws IOException {
        o.b bVar = new o.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Objects.requireNonNull(strNextName);
            switch (strNextName) {
                case "frames":
                    bVar.f30856c = c(jsonReader, i5.a.f31250f);
                    break;
                case "reason":
                    bVar.f30855b = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString = jsonReader.nextString();
                    Objects.requireNonNull(strNextString, "Null type");
                    bVar.f30854a = strNextString;
                    break;
                case "causedBy":
                    bVar.f30857d = e(jsonReader);
                    break;
                case "overflowCount":
                    bVar.f30858e = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return bVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:114:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:153:0x0245  */
    /* JADX WARN: Code duplicated, block: B:183:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:94:0x012a  */
    public static a0 f(JsonReader jsonReader) throws IOException {
        Charset charset = a0.f30712a;
        h5.b.C0300b c0300b = new h5.b.C0300b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Objects.requireNonNull(strNextName);
            switch (strNextName) {
                case "ndkPayload":
                    h5.e.b bVar = new h5.e.b();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        Objects.requireNonNull(strNextName2);
                        if (strNextName2.equals("files")) {
                            bVar.f30752a = c(jsonReader, z.f4668x);
                        } else if (strNextName2.equals("orgId")) {
                            bVar.f30753b = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    c0300b.f30728h = bVar.a();
                    break;
                case "sdkVersion":
                    String strNextString = jsonReader.nextString();
                    Objects.requireNonNull(strNextString, "Null sdkVersion");
                    c0300b.f30721a = strNextString;
                    break;
                case "buildVersion":
                    String strNextString2 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString2, "Null buildVersion");
                    c0300b.f30725e = strNextString2;
                    break;
                case "gmpAppId":
                    String strNextString3 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString3, "Null gmpAppId");
                    c0300b.f30722b = strNextString3;
                    break;
                case "installationUuid":
                    String strNextString4 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString4, "Null installationUuid");
                    c0300b.f30724d = strNextString4;
                    break;
                case "platform":
                    c0300b.f30723c = Integer.valueOf(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    String strNextString5 = jsonReader.nextString();
                    Objects.requireNonNull(strNextString5, "Null displayVersion");
                    c0300b.f30726f = strNextString5;
                    break;
                case "session":
                    g.b bVar2 = new g.b();
                    bVar2.b(false);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        Objects.requireNonNull(strNextName3);
                        switch (strNextName3) {
                            case "startedAt":
                                bVar2.f30771c = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "identifier":
                                bVar2.f30770b = new String(Base64.decode(jsonReader.nextString(), 2), a0.f30712a);
                                break;
                            case "endedAt":
                                bVar2.f30772d = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                j.b bVar3 = new j.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    Objects.requireNonNull(strNextName4);
                                    switch (strNextName4) {
                                        case "simulator":
                                            bVar3.f30807f = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "manufacturer":
                                            String strNextString6 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString6, "Null manufacturer");
                                            bVar3.f30809h = strNextString6;
                                            break;
                                        case "ram":
                                            bVar3.f30805d = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "arch":
                                            bVar3.f30802a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "diskSpace":
                                            bVar3.f30806e = Long.valueOf(jsonReader.nextLong());
                                            break;
                                        case "cores":
                                            bVar3.f30804c = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "model":
                                            String strNextString7 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString7, "Null model");
                                            bVar3.f30803b = strNextString7;
                                            break;
                                        case "state":
                                            bVar3.f30808g = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        case "modelClass":
                                            String strNextString8 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString8, "Null modelClass");
                                            bVar3.f30810i = strNextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                bVar2.f30777i = bVar3.a();
                                break;
                            case "events":
                                bVar2.f30778j = c(jsonReader, i5.a.f31248d);
                                break;
                            case "os":
                                u.b bVar4 = new u.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    Objects.requireNonNull(strNextName5);
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString9 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString9, "Null buildVersion");
                                            bVar4.f30901c = strNextString9;
                                            break;
                                        case "jailbroken":
                                            bVar4.f30902d = Boolean.valueOf(jsonReader.nextBoolean());
                                            break;
                                        case "version":
                                            String strNextString10 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString10, "Null version");
                                            bVar4.f30900b = strNextString10;
                                            break;
                                        case "platform":
                                            bVar4.f30899a = Integer.valueOf(jsonReader.nextInt());
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                bVar2.f30776h = bVar4.a();
                                break;
                            case "app":
                                h.b bVar5 = new h.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    Objects.requireNonNull(strNextName6);
                                    switch (strNextName6) {
                                        case "identifier":
                                            String strNextString11 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString11, "Null identifier");
                                            bVar5.f30787a = strNextString11;
                                            break;
                                        case "developmentPlatform":
                                            bVar5.f30791e = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            bVar5.f30792f = jsonReader.nextString();
                                            break;
                                        case "version":
                                            String strNextString12 = jsonReader.nextString();
                                            Objects.requireNonNull(strNextString12, "Null version");
                                            bVar5.f30788b = strNextString12;
                                            break;
                                        case "installationUuid":
                                            bVar5.f30790d = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            bVar5.f30789c = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                bVar2.f30774f = bVar5.a();
                                break;
                            case "user":
                                v.b bVar6 = new v.b();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName7 = jsonReader.nextName();
                                    Objects.requireNonNull(strNextName7);
                                    if (strNextName7.equals("identifier")) {
                                        String strNextString13 = jsonReader.nextString();
                                        Objects.requireNonNull(strNextString13, "Null identifier");
                                        bVar6.f30904a = strNextString13;
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                bVar2.f30775g = bVar6.a();
                                break;
                            case "generator":
                                String strNextString14 = jsonReader.nextString();
                                Objects.requireNonNull(strNextString14, "Null generator");
                                bVar2.f30769a = strNextString14;
                                break;
                            case "crashed":
                                bVar2.b(jsonReader.nextBoolean());
                                break;
                            case "generatorType":
                                bVar2.f30779k = Integer.valueOf(jsonReader.nextInt());
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c0300b.f30727g = bVar2.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0300b.a();
    }

    public a0 g(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                a0 a0VarF = f(jsonReader);
                jsonReader.close();
                return a0VarF;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }

    public String h(a0 a0Var) {
        d dVar = (d) f31272a;
        Objects.requireNonNull(dVar);
        StringWriter stringWriter = new StringWriter();
        try {
            dVar.a(a0Var, stringWriter);
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }
}
