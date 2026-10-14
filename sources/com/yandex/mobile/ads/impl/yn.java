package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class yn implements yt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f26890a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f26891b = new a(dp1.G);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f26892c = new a(jq1.f22126c);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0211a f26893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f26894b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.yn$a$a, reason: collision with other inner class name */
        public interface InterfaceC0211a {
            Constructor<? extends ut> a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public a(InterfaceC0211a interfaceC0211a) {
            this.f26893a = interfaceC0211a;
        }

        public final ut a(Object... objArr) {
            Constructor<? extends ut> constructorA;
            synchronized (this.f26894b) {
                if (this.f26894b.get()) {
                    constructorA = null;
                } else {
                    try {
                        constructorA = this.f26893a.a();
                    } catch (ClassNotFoundException unused) {
                        this.f26894b.set(true);
                        constructorA = null;
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating extension", e10);
                    }
                }
            }
            if (constructorA == null) {
                return null;
            }
            try {
                return constructorA.newInstance(objArr);
            } catch (Exception e11) {
                throw new IllegalStateException("Unexpected error creating extractor", e11);
            }
        }
    }

    private static void a(int i10, ArrayList arrayList) {
        ut gVar;
        switch (i10) {
            case 0:
                gVar = new g();
                break;
            case 1:
                gVar = new j();
                break;
            case 2:
                gVar = new i7();
                break;
            case 3:
                gVar = new v8();
                break;
            case 4:
                gVar = f26891b.a(0);
                if (gVar == null) {
                    gVar = new kv();
                }
                break;
            case 5:
                gVar = new sv();
                break;
            case 6:
                gVar = new ma0();
                break;
            case 7:
                gVar = new mf0((Object) null);
                break;
            case 8:
                arrayList.add(new cw(Collections.emptyList()));
                gVar = new nf0(0);
                break;
            case 9:
                gVar = new tn0();
                break;
            case 10:
                gVar = new zt0();
                break;
            case 11:
                gVar = new q81(0);
                break;
            case 12:
                gVar = new ri1();
                break;
            case 13:
            default:
                return;
            case 14:
                gVar = new o70();
                break;
            case 15:
                gVar = f26892c.a(new Object[0]);
                if (gVar == null) {
                    return;
                }
                break;
            case 16:
                gVar = new tc();
                break;
        }
        arrayList.add(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends ut> b() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("com.yandex.mobile.ads.exo.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("com.yandex.mobile.ads.exo.ext.flac.FlacExtractor").asSubclass(ut.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends ut> c() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("com.yandex.mobile.ads.exo.decoder.midi.MidiExtractor").asSubclass(ut.class).getConstructor(new Class[0]);
    }

    @Override // com.yandex.mobile.ads.impl.yt
    /* JADX INFO: renamed from: a */
    public final synchronized ut[] mo2a() {
        return a(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code duplicated, block: B:167:0x020b A[Catch: all -> 0x03a4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0017, B:8:0x001e, B:167:0x020b, B:168:0x020e, B:268:0x0384, B:271:0x038a, B:274:0x0390, B:275:0x0393, B:276:0x0396, B:171:0x0216, B:173:0x021e, B:176:0x0228, B:179:0x0232, B:181:0x023a, B:184:0x0244, B:187:0x024f, B:190:0x025b, B:193:0x0267, B:195:0x026f, B:197:0x0277, B:200:0x0281, B:202:0x028f, B:205:0x0299, B:208:0x02a4, B:210:0x02ac, B:212:0x02ba, B:214:0x02c8, B:217:0x02d8, B:219:0x02e6, B:222:0x02f0, B:224:0x02f8, B:226:0x0300, B:228:0x0308, B:231:0x0312, B:233:0x031a, B:236:0x0329, B:238:0x0331, B:241:0x033a, B:243:0x0342, B:246:0x034b, B:248:0x0353, B:251:0x035c, B:13:0x003d, B:39:0x0083, B:40:0x0087, B:147:0x01df, B:42:0x008c, B:46:0x009a, B:50:0x00a8, B:54:0x00b6, B:58:0x00c4, B:62:0x00d2, B:66:0x00e0, B:70:0x00ee, B:74:0x00fc, B:78:0x010a, B:82:0x0117, B:86:0x0125, B:90:0x0132, B:94:0x013f, B:98:0x014d, B:102:0x015a, B:106:0x0167, B:110:0x0175, B:114:0x0182, B:118:0x018f, B:122:0x019a, B:126:0x01a6, B:130:0x01b2, B:134:0x01bd, B:138:0x01c8, B:142:0x01d3, B:20:0x0053, B:24:0x005e, B:28:0x0069), top: B:282:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0214  */
    /* JADX WARN: Code duplicated, block: B:171:0x0216 A[Catch: all -> 0x03a4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0017, B:8:0x001e, B:167:0x020b, B:168:0x020e, B:268:0x0384, B:271:0x038a, B:274:0x0390, B:275:0x0393, B:276:0x0396, B:171:0x0216, B:173:0x021e, B:176:0x0228, B:179:0x0232, B:181:0x023a, B:184:0x0244, B:187:0x024f, B:190:0x025b, B:193:0x0267, B:195:0x026f, B:197:0x0277, B:200:0x0281, B:202:0x028f, B:205:0x0299, B:208:0x02a4, B:210:0x02ac, B:212:0x02ba, B:214:0x02c8, B:217:0x02d8, B:219:0x02e6, B:222:0x02f0, B:224:0x02f8, B:226:0x0300, B:228:0x0308, B:231:0x0312, B:233:0x031a, B:236:0x0329, B:238:0x0331, B:241:0x033a, B:243:0x0342, B:246:0x034b, B:248:0x0353, B:251:0x035c, B:13:0x003d, B:39:0x0083, B:40:0x0087, B:147:0x01df, B:42:0x008c, B:46:0x009a, B:50:0x00a8, B:54:0x00b6, B:58:0x00c4, B:62:0x00d2, B:66:0x00e0, B:70:0x00ee, B:74:0x00fc, B:78:0x010a, B:82:0x0117, B:86:0x0125, B:90:0x0132, B:94:0x013f, B:98:0x014d, B:102:0x015a, B:106:0x0167, B:110:0x0175, B:114:0x0182, B:118:0x018f, B:122:0x019a, B:126:0x01a6, B:130:0x01b2, B:134:0x01bd, B:138:0x01c8, B:142:0x01d3, B:20:0x0053, B:24:0x005e, B:28:0x0069), top: B:282:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:265:0x037f  */
    /* JADX WARN: Code duplicated, block: B:267:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:271:0x038a A[Catch: all -> 0x03a4, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0017, B:8:0x001e, B:167:0x020b, B:168:0x020e, B:268:0x0384, B:271:0x038a, B:274:0x0390, B:275:0x0393, B:276:0x0396, B:171:0x0216, B:173:0x021e, B:176:0x0228, B:179:0x0232, B:181:0x023a, B:184:0x0244, B:187:0x024f, B:190:0x025b, B:193:0x0267, B:195:0x026f, B:197:0x0277, B:200:0x0281, B:202:0x028f, B:205:0x0299, B:208:0x02a4, B:210:0x02ac, B:212:0x02ba, B:214:0x02c8, B:217:0x02d8, B:219:0x02e6, B:222:0x02f0, B:224:0x02f8, B:226:0x0300, B:228:0x0308, B:231:0x0312, B:233:0x031a, B:236:0x0329, B:238:0x0331, B:241:0x033a, B:243:0x0342, B:246:0x034b, B:248:0x0353, B:251:0x035c, B:13:0x003d, B:39:0x0083, B:40:0x0087, B:147:0x01df, B:42:0x008c, B:46:0x009a, B:50:0x00a8, B:54:0x00b6, B:58:0x00c4, B:62:0x00d2, B:66:0x00e0, B:70:0x00ee, B:74:0x00fc, B:78:0x010a, B:82:0x0117, B:86:0x0125, B:90:0x0132, B:94:0x013f, B:98:0x014d, B:102:0x015a, B:106:0x0167, B:110:0x0175, B:114:0x0182, B:118:0x018f, B:122:0x019a, B:126:0x01a6, B:130:0x01b2, B:134:0x01bd, B:138:0x01c8, B:142:0x01d3, B:20:0x0053, B:24:0x005e, B:28:0x0069), top: B:282:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:273:0x038e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x0393 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.mobile.ads.impl.yt
    public final synchronized ut[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        byte b10;
        byte b11;
        int i10;
        String lastPathSegment;
        int i11;
        int i12;
        int[] iArr = f26890a;
        arrayList = new ArrayList(16);
        List<String> list = map.get("Content-Type");
        String str = (list == null || list.isEmpty()) ? null : list.get(0);
        int i13 = 1;
        if (str != null) {
            int i14 = te0.f25347c;
            int iHashCode = str.hashCode();
            if (iHashCode != -1007807498) {
                if (iHashCode != -586683234) {
                    b10 = (iHashCode == 187090231 && str.equals("audio/mp3")) ? (byte) 2 : (byte) -1;
                } else if (str.equals("audio/x-wav")) {
                    b10 = 1;
                }
            } else if (str.equals("audio/x-flac")) {
                b10 = 0;
            }
            if (b10 == 0) {
                str = "audio/flac";
            } else if (b10 == 1) {
                str = "audio/wav";
            } else if (b10 == 2) {
                str = "audio/mpeg";
            }
            switch (str.hashCode()) {
                case -2123537834:
                    b11 = str.equals("audio/eac3-joc") ? (byte) 0 : (byte) -1;
                    break;
                case -1662384011:
                    if (str.equals("video/mp2p")) {
                        b11 = 1;
                    }
                    break;
                case -1662384007:
                    if (str.equals("video/mp2t")) {
                        b11 = 2;
                    }
                    break;
                case -1662095187:
                    if (str.equals("video/webm")) {
                        b11 = 3;
                    }
                    break;
                case -1606874997:
                    if (str.equals("audio/amr-wb")) {
                        b11 = 4;
                    }
                    break;
                case -1487394660:
                    if (str.equals("image/jpeg")) {
                        b11 = 5;
                    }
                    break;
                case -1248337486:
                    if (str.equals("application/mp4")) {
                        b11 = 6;
                    }
                    break;
                case -1079884372:
                    if (str.equals("video/x-msvideo")) {
                        b11 = 7;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        b11 = 8;
                    }
                    break;
                case -387023398:
                    if (str.equals("audio/x-matroska")) {
                        b11 = 9;
                    }
                    break;
                case -43467528:
                    if (str.equals("application/webm")) {
                        b11 = 10;
                    }
                    break;
                case 13915911:
                    if (str.equals("video/x-flv")) {
                        b11 = 11;
                    }
                    break;
                case 187078296:
                    if (str.equals("audio/ac3")) {
                        b11 = 12;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        b11 = 13;
                    }
                    break;
                case 187078669:
                    if (str.equals("audio/amr")) {
                        b11 = 14;
                    }
                    break;
                case 187090232:
                    if (str.equals("audio/mp4")) {
                        b11 = 15;
                    }
                    break;
                case 187091926:
                    if (str.equals("audio/ogg")) {
                        b11 = 16;
                    }
                    break;
                case 187099443:
                    if (str.equals("audio/wav")) {
                        b11 = 17;
                    }
                    break;
                case 1331848029:
                    if (str.equals("video/mp4")) {
                        b11 = 18;
                    }
                    break;
                case 1503095341:
                    if (str.equals("audio/3gpp")) {
                        b11 = 19;
                    }
                    break;
                case 1504578661:
                    if (str.equals("audio/eac3")) {
                        b11 = 20;
                    }
                    break;
                case 1504619009:
                    if (str.equals("audio/flac")) {
                        b11 = 21;
                    }
                    break;
                case 1504824762:
                    if (str.equals("audio/midi")) {
                        b11 = 22;
                    }
                    break;
                case 1504831518:
                    if (str.equals("audio/mpeg")) {
                        b11 = 23;
                    }
                    break;
                case 1505118770:
                    if (str.equals("audio/webm")) {
                        b11 = Ascii.CAN;
                    }
                    break;
                case 2039520277:
                    if (str.equals("video/x-matroska")) {
                        b11 = Ascii.EM;
                    }
                    break;
                default:
                    break;
            }
            switch (b11) {
                case 0:
                case 12:
                case 20:
                    i10 = 0;
                    break;
                case 1:
                    i10 = 10;
                    break;
                case 2:
                    i10 = 11;
                    break;
                case 3:
                case 9:
                case 10:
                case 24:
                case 25:
                    i10 = 6;
                    break;
                case 4:
                case 14:
                case 19:
                    i10 = 3;
                    break;
                case 5:
                    i10 = 14;
                    break;
                case 6:
                case 15:
                case 18:
                    i10 = 8;
                    break;
                case 7:
                    i10 = 16;
                    break;
                case 8:
                    i10 = 13;
                    break;
                case 11:
                    i10 = 5;
                    break;
                case 13:
                    i10 = 1;
                    break;
                case 16:
                    i10 = 9;
                    break;
                case 17:
                    i10 = 12;
                    break;
                case 21:
                    i10 = 4;
                    break;
                case 22:
                    i10 = 15;
                    break;
                case 23:
                    i10 = 7;
                    break;
                default:
                    break;
            }
            if (i10 != -1) {
                a(i10, arrayList);
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
                if (!lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                    i13 = 0;
                } else if (!lastPathSegment.endsWith(".ac4")) {
                    if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                        i13 = 2;
                    } else if (lastPathSegment.endsWith(".amr")) {
                        i13 = 3;
                    } else if (lastPathSegment.endsWith(".flac")) {
                        i13 = 4;
                    } else if (lastPathSegment.endsWith(".flv")) {
                        i13 = 5;
                    } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                        i13 = 15;
                    } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                        i13 = 6;
                    } else if (lastPathSegment.endsWith(".mp3")) {
                        i13 = 7;
                    } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                        i13 = 8;
                    } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                        i13 = 9;
                    } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                        i13 = 10;
                    } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                        i13 = 11;
                    } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                        i13 = 12;
                    } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                        i13 = 13;
                    } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                        i13 = 14;
                    } else if (lastPathSegment.endsWith(".avi")) {
                        i13 = 16;
                    }
                }
                if (i13 != -1 && i13 != i10) {
                    a(i13, arrayList);
                }
                for (i11 = 0; i11 < 16; i11++) {
                    i12 = iArr[i11];
                    if (i12 == i10 && i12 != i13) {
                        a(i12, arrayList);
                    }
                }
            }
            i13 = -1;
            if (i13 != -1) {
                a(i13, arrayList);
            }
            while (i11 < 16) {
                i12 = iArr[i11];
                if (i12 == i10) {
                }
            }
        }
        i10 = -1;
        if (i10 != -1) {
            a(i10, arrayList);
        }
        lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            if (lastPathSegment.endsWith(".ac3")) {
                i13 = 0;
            } else {
                i13 = 0;
            }
            if (i13 != -1) {
                a(i13, arrayList);
            }
            while (i11 < 16) {
                i12 = iArr[i11];
                if (i12 == i10) {
                }
            }
        }
        i13 = -1;
        if (i13 != -1) {
            a(i13, arrayList);
        }
        while (i11 < 16) {
            i12 = iArr[i11];
            if (i12 == i10) {
            }
        }
        return (ut[]) arrayList.toArray(new ut[arrayList.size()]);
    }
}
