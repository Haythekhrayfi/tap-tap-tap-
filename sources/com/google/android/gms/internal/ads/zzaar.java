package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Ascii;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaar implements zzabd {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    private static final zzaaq zzc = new zzaaq(new zzaap() { // from class: com.google.android.gms.internal.ads.zzaan
        @Override // com.google.android.gms.internal.ads.zzaap
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzaaw.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzaaq zzd = new zzaaq(new zzaap() { // from class: com.google.android.gms.internal.ads.zzaao
        @Override // com.google.android.gms.internal.ads.zzaap
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzaaw.class).getConstructor(new Class[0]);
        }
    });
    private zzfsc zze;

    private final void zzb(int i10, List list) {
        Object zzahyVar;
        switch (i10) {
            case 0:
                zzahyVar = new zzahy();
                break;
            case 1:
                zzahyVar = new zzaib();
                break;
            case 2:
                zzahyVar = new zzaie(0);
                break;
            case 3:
                zzahyVar = new zzach(0);
                break;
            case 4:
                zzaaw zzaawVarZza = zzc.zza(0);
                if (zzaawVarZza != null) {
                    list.add(zzaawVarZza);
                    return;
                }
                zzahyVar = new zzacy(0);
                break;
            case 5:
                zzahyVar = new zzadb();
                break;
            case 6:
                zzahyVar = new zzafp(0);
                break;
            case 7:
                zzahyVar = new zzafx(0);
                break;
            case 8:
                list.add(new zzagt(0, null));
                zzahyVar = new zzagy(0);
                break;
            case 9:
                zzahyVar = new zzahm();
                break;
            case 10:
                zzahyVar = new zzajh();
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzfsc.zzl();
                }
                zzahyVar = new zzajr(1, new zzfh(0L), new zzaig(0, this.zze), 112800);
                break;
            case 12:
                zzahyVar = new zzakd();
                break;
            case 13:
            default:
                return;
            case 14:
                zzahyVar = new zzadg();
                break;
            case 15:
                zzaaw zzaawVarZza2 = zzd.zza(new Object[0]);
                if (zzaawVarZza2 != null) {
                    list.add(zzaawVarZza2);
                    return;
                }
                return;
            case 16:
                zzahyVar = new zzacm();
                break;
        }
        list.add(zzahyVar);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:141:0x01de  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzabd
    public final synchronized zzaaw[] zza(Uri uri, Map map) {
        ArrayList arrayList;
        byte b10;
        byte b11;
        int i10;
        arrayList = new ArrayList(16);
        List list = (List) map.get("Content-Type");
        String str = null;
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        }
        int i11 = 2;
        if (str != null) {
            int i12 = zzcc.zza;
            int iHashCode = str.hashCode();
            if (iHashCode != -1007807498) {
                if (iHashCode != -586683234) {
                    if (iHashCode == 187090231 && str.equals("audio/mp3")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("audio/x-wav")) {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("audio/x-flac")) {
                b10 = 0;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                str = "audio/flac";
            } else if (b10 == 1) {
                str = "audio/mpeg";
            } else if (b10 == 2) {
                str = "audio/wav";
            }
            switch (str.hashCode()) {
                case -2123537834:
                    if (str.equals("audio/eac3-joc")) {
                        b11 = 2;
                    } else {
                        b11 = -1;
                    }
                    break;
                case -1662384011:
                    if (str.equals("video/mp2p")) {
                        b11 = 20;
                    } else {
                        b11 = -1;
                    }
                    break;
                case -1662384007:
                    if (str.equals("video/mp2t")) {
                        b11 = 21;
                    } else {
                        b11 = -1;
                    }
                    break;
                case -1662095187:
                    if (str.equals("video/webm")) {
                        b11 = 12;
                    } else {
                        b11 = -1;
                    }
                    break;
                case -1606874997:
                    if (str.equals("audio/amr-wb")) {
                        b11 = 6;
                    } else {
                        b11 = -1;
                    }
                    break;
                case -1487394660:
                    if (str.equals("image/jpeg")) {
                        b11 = Ascii.CAN;
                    } else {
                        b11 = -1;
                    }
                    break;
                case -1248337486:
                    if (str.equals("application/mp4")) {
                        b11 = 18;
                    } else {
                        b11 = -1;
                    }
                    break;
                case -1079884372:
                    if (str.equals("video/x-msvideo")) {
                        b11 = Ascii.EM;
                    } else {
                        b11 = -1;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        b11 = 23;
                    } else {
                        b11 = -1;
                    }
                    break;
                case -387023398:
                    if (str.equals("audio/x-matroska")) {
                        b11 = 11;
                    } else {
                        b11 = -1;
                    }
                    break;
                case -43467528:
                    if (str.equals("application/webm")) {
                        b11 = 14;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 13915911:
                    if (str.equals("video/x-flv")) {
                        b11 = 8;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 187078296:
                    if (str.equals("audio/ac3")) {
                        b11 = 0;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 187078297:
                    if (str.equals("audio/ac4")) {
                        b11 = 3;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 187078669:
                    if (str.equals("audio/amr")) {
                        b11 = 4;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 187090232:
                    if (str.equals("audio/mp4")) {
                        b11 = 17;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 187091926:
                    if (str.equals("audio/ogg")) {
                        b11 = 19;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 187099443:
                    if (str.equals("audio/wav")) {
                        b11 = 22;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 1331848029:
                    if (str.equals("video/mp4")) {
                        b11 = 16;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 1503095341:
                    if (str.equals("audio/3gpp")) {
                        b11 = 5;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 1504578661:
                    if (str.equals("audio/eac3")) {
                        b11 = 1;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 1504619009:
                    if (str.equals("audio/flac")) {
                        b11 = 7;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 1504824762:
                    if (str.equals("audio/midi")) {
                        b11 = 9;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 1504831518:
                    if (str.equals("audio/mpeg")) {
                        b11 = 15;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 1505118770:
                    if (str.equals("audio/webm")) {
                        b11 = 13;
                    } else {
                        b11 = -1;
                    }
                    break;
                case 2039520277:
                    if (str.equals("video/x-matroska")) {
                        b11 = 10;
                    } else {
                        b11 = -1;
                    }
                    break;
                default:
                    b11 = -1;
                    break;
            }
            switch (b11) {
                case 0:
                case 1:
                case 2:
                    i10 = 0;
                    break;
                case 3:
                    i10 = 1;
                    break;
                case 4:
                case 5:
                case 6:
                    i10 = 3;
                    break;
                case 7:
                    i10 = 4;
                    break;
                case 8:
                    i10 = 5;
                    break;
                case 9:
                    i10 = 15;
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    i10 = 6;
                    break;
                case 15:
                    i10 = 7;
                    break;
                case 16:
                case 17:
                case 18:
                    i10 = 8;
                    break;
                case 19:
                    i10 = 9;
                    break;
                case 20:
                    i10 = 10;
                    break;
                case 21:
                    i10 = 11;
                    break;
                case 22:
                    i10 = 12;
                    break;
                case 23:
                    i10 = 13;
                    break;
                case 24:
                    i10 = 14;
                    break;
                case 25:
                    i10 = 16;
                    break;
                default:
                    i10 = -1;
                    break;
            }
        } else {
            i10 = -1;
        }
        if (i10 != -1) {
            zzb(i10, arrayList);
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            i11 = -1;
        } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            i11 = 0;
        } else if (lastPathSegment.endsWith(".ac4")) {
            i11 = 1;
        } else if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
            if (lastPathSegment.endsWith(".amr")) {
                i11 = 3;
            } else if (lastPathSegment.endsWith(".flac")) {
                i11 = 4;
            } else if (lastPathSegment.endsWith(".flv")) {
                i11 = 5;
            } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                i11 = 15;
            } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                i11 = 6;
            } else if (lastPathSegment.endsWith(".mp3")) {
                i11 = 7;
            } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                i11 = 8;
            } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                i11 = 9;
            } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                i11 = 10;
            } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                i11 = 11;
            } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                i11 = 12;
            } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                i11 = 13;
            } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                i11 = 14;
            } else if (lastPathSegment.endsWith(".avi")) {
                i11 = 16;
            } else {
                i11 = -1;
            }
        }
        if (i11 != -1 && i11 != i10) {
            zzb(i11, arrayList);
        }
        int[] iArr = zza;
        for (int i13 = 0; i13 < 16; i13++) {
            int i14 = iArr[i13];
            if (i14 != i10 && i14 != i11) {
                zzb(i14, arrayList);
            }
        }
        return (zzaaw[]) arrayList.toArray(new zzaaw[arrayList.size()]);
    }
}
