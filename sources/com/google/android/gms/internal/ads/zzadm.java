package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes2.dex */
final class zzadm {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static zzadi zza(String str) throws IOException {
        long j10;
        String str2;
        String str3;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!zzfk.zzc(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw zzcd.zza("Couldn't find xmp metadata", null);
            }
            zzfsc zzfscVarZzl = zzfsc.zzl();
            long j11 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (zzfk.zzc(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i10 = 0;
                    for (int i11 = 0; i11 < 4; i11++) {
                        String strZza = zzfk.zza(xmlPullParserNewPullParser, strArr[i11]);
                        if (strZza != null) {
                            if (Integer.parseInt(strZza) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i12 = 0;
                            while (true) {
                                if (i12 < 4) {
                                    String strZza2 = zzfk.zza(xmlPullParserNewPullParser, strArr2[i12]);
                                    if (strZza2 != null) {
                                        j10 = Long.parseLong(strZza2);
                                        if (j10 != -1) {
                                            break;
                                        }
                                    } else {
                                        i12++;
                                    }
                                }
                                j10 = -9223372036854775807L;
                                break;
                            }
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i10 >= 2) {
                                    zzfscVarZzl = zzfsc.zzl();
                                    break;
                                }
                                String strZza3 = zzfk.zza(xmlPullParserNewPullParser, strArr3[i10]);
                                if (strZza3 != null) {
                                    zzfscVarZzl = zzfsc.zzn(new zzadh("image/jpeg", "Primary", 0L, 0L), new zzadh("video/mp4", "MotionPhoto", Long.parseLong(strZza3), 0L));
                                    break;
                                }
                                i10++;
                            }
                            j11 = j10;
                        }
                    }
                    return null;
                }
                if (zzfk.zzc(xmlPullParserNewPullParser, "Container:Directory")) {
                    str2 = "Container";
                    str3 = "Item";
                } else if (zzfk.zzc(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    str2 = "GContainer";
                    str3 = "GContainerItem";
                }
                zzfscVarZzl = zzb(xmlPullParserNewPullParser, str2, str3);
            } while (!zzfk.zzb(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (zzfscVarZzl.isEmpty()) {
                return null;
            }
            return new zzadi(j11, zzfscVarZzl);
        } catch (zzcd | NumberFormatException | XmlPullParserException unused) {
            zzer.zzf("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfsc zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzfrz zzfrzVar = new zzfrz();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfk.zzc(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strZza = zzfk.zza(xmlPullParser, strConcat2);
                String strZza2 = zzfk.zza(xmlPullParser, strConcat3);
                String strZza3 = zzfk.zza(xmlPullParser, strConcat4);
                String strZza4 = zzfk.zza(xmlPullParser, strConcat5);
                if (strZza == null || strZza2 == null) {
                    return zzfsc.zzl();
                }
                zzfrzVar.zzf(new zzadh(strZza, strZza2, strZza3 != null ? Long.parseLong(strZza3) : 0L, strZza4 != null ? Long.parseLong(strZza4) : 0L));
            }
        } while (!zzfk.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfrzVar.zzi();
    }
}
