package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzacq implements zzaci {
    public final zzfsc zza;
    private final int zzb;

    private zzacq(int i10, zzfsc zzfscVar) {
        this.zzb = i10;
        this.zza = zzfscVar;
    }

    public static zzacq zzc(int i10, zzfa zzfaVar) {
        String strConcat;
        int iZzi;
        String str;
        StringBuilder sb2;
        String str2;
        String str3;
        zzfrz zzfrzVar = new zzfrz();
        int iZzd = zzfaVar.zzd();
        int i11 = -2;
        while (zzfaVar.zza() > 8) {
            int iZzg = zzfaVar.zzg();
            int iZzc = zzfaVar.zzc() + zzfaVar.zzg();
            zzfaVar.zzE(iZzc);
            zzaci zzacrVar = null;
            if (iZzg != 1414744396) {
                switch (iZzg) {
                    case 1718776947:
                        if (i11 == 2) {
                            zzfaVar.zzG(4);
                            int iZzg2 = zzfaVar.zzg();
                            int iZzg3 = zzfaVar.zzg();
                            zzfaVar.zzG(4);
                            iZzi = zzfaVar.zzg();
                            switch (iZzi) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str3 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str3 = "video/avc";
                                    break;
                                case 842289229:
                                    str3 = "video/mp42";
                                    break;
                                case 859066445:
                                    str3 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str3 = "video/mjpeg";
                                    break;
                                default:
                                    str3 = null;
                                    break;
                            }
                            if (str3 != null) {
                                zzak zzakVar = new zzak();
                                zzakVar.zzX(iZzg2);
                                zzakVar.zzF(iZzg3);
                                zzakVar.zzS(str3);
                                zzacrVar = new zzacr(zzakVar.zzY());
                            } else {
                                sb2 = new StringBuilder();
                                str2 = "Ignoring track with unsupported compression ";
                                sb2.append(str2);
                                sb2.append(iZzi);
                                strConcat = sb2.toString();
                                zzer.zzf("StreamFormatChunk", strConcat);
                            }
                        } else if (i11 != 1) {
                            strConcat = "Ignoring strf box for unsupported track type: ".concat(zzfj.zzy(i11));
                            zzer.zzf("StreamFormatChunk", strConcat);
                        } else {
                            iZzi = zzfaVar.zzi();
                            if (iZzi == 1) {
                                str = "audio/raw";
                            } else if (iZzi == 85) {
                                str = "audio/mpeg";
                            } else if (iZzi == 255) {
                                str = "audio/mp4a-latm";
                            } else if (iZzi != 8192) {
                                str = iZzi != 8193 ? null : "audio/vnd.dts";
                            } else {
                                str = "audio/ac3";
                            }
                            if (str != null) {
                                int iZzi2 = zzfaVar.zzi();
                                int iZzg4 = zzfaVar.zzg();
                                zzfaVar.zzG(6);
                                int iZzj = zzfj.zzj(zzfaVar.zzo());
                                int iZzi3 = zzfaVar.zzi();
                                byte[] bArr = new byte[iZzi3];
                                zzfaVar.zzB(bArr, 0, iZzi3);
                                zzak zzakVar2 = new zzak();
                                zzakVar2.zzS(str);
                                zzakVar2.zzw(iZzi2);
                                zzakVar2.zzT(iZzg4);
                                if ("audio/raw".equals(str) && iZzj != 0) {
                                    zzakVar2.zzN(iZzj);
                                }
                                if ("audio/mp4a-latm".equals(str) && iZzi3 > 0) {
                                    zzakVar2.zzI(zzfsc.zzm(bArr));
                                }
                                zzacrVar = new zzacr(zzakVar2.zzY());
                            } else {
                                sb2 = new StringBuilder();
                                str2 = "Ignoring track with unsupported format tag ";
                                sb2.append(str2);
                                sb2.append(iZzi);
                                strConcat = sb2.toString();
                                zzer.zzf("StreamFormatChunk", strConcat);
                            }
                        }
                        break;
                    case 1751742049:
                        zzacrVar = zzacn.zzb(zzfaVar);
                        break;
                    case 1752331379:
                        zzacrVar = zzaco.zzb(zzfaVar);
                        break;
                    case 1852994675:
                        zzacrVar = zzacs.zzb(zzfaVar);
                        break;
                }
            } else {
                zzacrVar = zzc(zzfaVar.zzg(), zzfaVar);
            }
            if (zzacrVar != null) {
                if (zzacrVar.zza() == 1752331379) {
                    int i12 = ((zzaco) zzacrVar).zza;
                    if (i12 == 1935960438) {
                        i11 = 2;
                    } else if (i12 == 1935963489) {
                        i11 = 1;
                    } else if (i12 != 1937012852) {
                        zzer.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i12))));
                        i11 = -1;
                    } else {
                        i11 = 3;
                    }
                }
                zzfrzVar.zzf(zzacrVar);
            }
            zzfaVar.zzF(iZzc);
            zzfaVar.zzE(iZzd);
        }
        return new zzacq(i10, zzfrzVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaci
    public final int zza() {
        return this.zzb;
    }

    public final zzaci zzb(Class cls) {
        zzfsc zzfscVar = this.zza;
        int size = zzfscVar.size();
        int i10 = 0;
        while (i10 < size) {
            zzaci zzaciVar = (zzaci) zzfscVar.get(i10);
            i10++;
            if (zzaciVar.getClass() == cls) {
                return zzaciVar;
            }
        }
        return null;
    }
}
