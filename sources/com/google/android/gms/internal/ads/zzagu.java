package com.google.android.gms.internal.ads;

import com.developer.filepicker.model.DialogConfigs;

/* JADX INFO: loaded from: classes2.dex */
final class zzagu {
    public static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    public static zzby zza(zzfa zzfaVar) {
        String str;
        String str2;
        int iZze = zzfaVar.zze() + zzfaVar.zzc();
        int iZze2 = zzfaVar.zze();
        int i10 = (iZze2 >> 24) & 255;
        zzby zzaegVar = null;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = iZze2 & 16777215;
                if (i11 == 6516084) {
                    int iZze3 = zzfaVar.zze();
                    if (zzfaVar.zze() == 1684108385) {
                        zzfaVar.zzG(8);
                        String strZzw = zzfaVar.zzw(iZze3 - 16);
                        zzaegVar = new zzaeg("und", strZzw, strZzw);
                    } else {
                        zzer.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzage.zzf(iZze2)));
                    }
                    zzfaVar.zzF(iZze);
                    return zzaegVar;
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    zzaev zzaevVarZze = zze(iZze2, "TIT2", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze;
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    zzaev zzaevVarZze2 = zze(iZze2, "TCOM", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze2;
                }
                if (i11 == 6578553) {
                    zzaev zzaevVarZze3 = zze(iZze2, "TDRC", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze3;
                }
                if (i11 == 4280916) {
                    zzaev zzaevVarZze4 = zze(iZze2, "TPE1", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze4;
                }
                if (i11 == 7630703) {
                    zzaev zzaevVarZze5 = zze(iZze2, "TSSE", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze5;
                }
                if (i11 == 6384738) {
                    zzaev zzaevVarZze6 = zze(iZze2, "TALB", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze6;
                }
                if (i11 == 7108978) {
                    zzaev zzaevVarZze7 = zze(iZze2, "USLT", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze7;
                }
                if (i11 == 6776174) {
                    zzaev zzaevVarZze8 = zze(iZze2, "TCON", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze8;
                }
                if (i11 == 6779504) {
                    zzaev zzaevVarZze9 = zze(iZze2, "TIT1", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze9;
                }
            } else {
                if (iZze2 == 1735291493) {
                    int iZzb = zzb(zzfaVar);
                    String str3 = (iZzb <= 0 || iZzb > 192) ? null : zza[iZzb - 1];
                    if (str3 != null) {
                        zzaegVar = new zzaev("TCON", null, zzfsc.zzm(str3));
                    } else {
                        zzer.zzf("MetadataUtil", "Failed to parse standard genre code");
                    }
                    zzfaVar.zzF(iZze);
                    return zzaegVar;
                }
                if (iZze2 == 1684632427) {
                    zzaev zzaevVarZzd = zzd(1684632427, "TPOS", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZzd;
                }
                if (iZze2 == 1953655662) {
                    zzaev zzaevVarZzd2 = zzd(1953655662, "TRCK", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZzd2;
                }
                if (iZze2 == 1953329263) {
                    zzaen zzaenVarZzc = zzc(1953329263, "TBPM", zzfaVar, true, false);
                    zzfaVar.zzF(iZze);
                    return zzaenVarZzc;
                }
                if (iZze2 == 1668311404) {
                    zzaen zzaenVarZzc2 = zzc(1668311404, "TCMP", zzfaVar, true, true);
                    zzfaVar.zzF(iZze);
                    return zzaenVarZzc2;
                }
                if (iZze2 == 1668249202) {
                    int iZze4 = zzfaVar.zze();
                    if (zzfaVar.zze() == 1684108385) {
                        int iZze5 = zzfaVar.zze() & 16777215;
                        if (iZze5 == 13) {
                            str2 = "image/jpeg";
                        } else if (iZze5 == 14) {
                            str2 = "image/png";
                            iZze5 = 14;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str = "Unrecognized cover art flags: " + iZze5;
                        } else {
                            zzfaVar.zzG(4);
                            int i12 = iZze4 - 16;
                            byte[] bArr = new byte[i12];
                            zzfaVar.zzB(bArr, 0, i12);
                            zzaegVar = new zzady(str2, null, 3, bArr);
                        }
                        zzfaVar.zzF(iZze);
                        return zzaegVar;
                    }
                    str = "Failed to parse cover art attribute";
                    zzer.zzf("MetadataUtil", str);
                    zzfaVar.zzF(iZze);
                    return zzaegVar;
                }
                if (iZze2 == 1631670868) {
                    zzaev zzaevVarZze10 = zze(1631670868, "TPE2", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze10;
                }
                if (iZze2 == 1936682605) {
                    zzaev zzaevVarZze11 = zze(1936682605, "TSOT", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze11;
                }
                if (iZze2 == 1936679276) {
                    zzaev zzaevVarZze12 = zze(1936679276, "TSO2", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze12;
                }
                if (iZze2 == 1936679282) {
                    zzaev zzaevVarZze13 = zze(1936679282, "TSOA", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze13;
                }
                if (iZze2 == 1936679265) {
                    zzaev zzaevVarZze14 = zze(1936679265, "TSOP", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze14;
                }
                if (iZze2 == 1936679791) {
                    zzaev zzaevVarZze15 = zze(1936679791, "TSOC", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze15;
                }
                if (iZze2 == 1920233063) {
                    zzaen zzaenVarZzc3 = zzc(1920233063, "ITUNESADVISORY", zzfaVar, false, false);
                    zzfaVar.zzF(iZze);
                    return zzaenVarZzc3;
                }
                if (iZze2 == 1885823344) {
                    zzaen zzaenVarZzc4 = zzc(1885823344, "ITUNESGAPLESS", zzfaVar, false, true);
                    zzfaVar.zzF(iZze);
                    return zzaenVarZzc4;
                }
                if (iZze2 == 1936683886) {
                    zzaev zzaevVarZze16 = zze(1936683886, "TVSHOWSORT", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze16;
                }
                if (iZze2 == 1953919848) {
                    zzaev zzaevVarZze17 = zze(1953919848, "TVSHOW", zzfaVar);
                    zzfaVar.zzF(iZze);
                    return zzaevVarZze17;
                }
                if (iZze2 == 757935405) {
                    String strZzw2 = null;
                    String strZzw3 = null;
                    int i13 = -1;
                    int i14 = -1;
                    while (zzfaVar.zzc() < iZze) {
                        int iZzc = zzfaVar.zzc();
                        int iZze6 = zzfaVar.zze();
                        int iZze7 = zzfaVar.zze();
                        zzfaVar.zzG(4);
                        if (iZze7 == 1835360622) {
                            strZzw2 = zzfaVar.zzw(iZze6 - 12);
                        } else if (iZze7 == 1851878757) {
                            strZzw3 = zzfaVar.zzw(iZze6 - 12);
                        } else {
                            if (iZze7 == 1684108385) {
                                i14 = iZze6;
                            }
                            if (iZze7 == 1684108385) {
                                i13 = iZzc;
                            }
                            zzfaVar.zzG(iZze6 - 12);
                        }
                    }
                    if (strZzw2 != null && strZzw3 != null && i13 != -1) {
                        zzfaVar.zzF(i13);
                        zzfaVar.zzG(16);
                        zzaegVar = new zzaep(strZzw2, strZzw3, zzfaVar.zzw(i14 - 16));
                    }
                    zzfaVar.zzF(iZze);
                    return zzaegVar;
                }
            }
            zzer.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzage.zzf(iZze2));
            zzfaVar.zzF(iZze);
            return null;
        } catch (Throwable th) {
            zzfaVar.zzF(iZze);
            throw th;
        }
    }

    private static int zzb(zzfa zzfaVar) {
        zzfaVar.zzG(4);
        if (zzfaVar.zze() == 1684108385) {
            zzfaVar.zzG(8);
            return zzfaVar.zzk();
        }
        zzer.zzf("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzaen zzc(int i10, String str, zzfa zzfaVar, boolean z10, boolean z11) {
        int iZzb = zzb(zzfaVar);
        if (z11) {
            iZzb = Math.min(1, iZzb);
        }
        if (iZzb >= 0) {
            return z10 ? new zzaev(str, null, zzfsc.zzm(Integer.toString(iZzb))) : new zzaeg("und", str, Integer.toString(iZzb));
        }
        zzer.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzage.zzf(i10)));
        return null;
    }

    private static zzaev zzd(int i10, String str, zzfa zzfaVar) {
        int iZze = zzfaVar.zze();
        if (zzfaVar.zze() == 1684108385 && iZze >= 22) {
            zzfaVar.zzG(10);
            int iZzo = zzfaVar.zzo();
            if (iZzo > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iZzo);
                String string = sb2.toString();
                int iZzo2 = zzfaVar.zzo();
                if (iZzo2 > 0) {
                    string = string + DialogConfigs.DIRECTORY_SEPERATOR + iZzo2;
                }
                return new zzaev(str, null, zzfsc.zzm(string));
            }
        }
        zzer.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzage.zzf(i10)));
        return null;
    }

    private static zzaev zze(int i10, String str, zzfa zzfaVar) {
        int iZze = zzfaVar.zze();
        if (zzfaVar.zze() == 1684108385) {
            zzfaVar.zzG(8);
            return new zzaev(str, null, zzfsc.zzm(zzfaVar.zzw(iZze - 16)));
        }
        zzer.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzage.zzf(i10)));
        return null;
    }
}
