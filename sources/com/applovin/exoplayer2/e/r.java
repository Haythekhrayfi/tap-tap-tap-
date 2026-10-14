package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.l.ai;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f6126c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6127a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6128b = -1;

    private boolean a(String str) {
        Matcher matcher = f6126c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) ai.a(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) ai.a(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f6127a = i10;
            this.f6128b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f6127a == -1 || this.f6128b == -1) ? false : true;
    }

    public boolean a(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f6127a = i11;
        this.f6128b = i12;
        return true;
    }

    public boolean a(com.applovin.exoplayer2.g.a aVar) {
        for (int i10 = 0; i10 < aVar.a(); i10++) {
            com.applovin.exoplayer2.g.a.InterfaceC0092a interfaceC0092aA = aVar.a(i10);
            if (interfaceC0092aA instanceof com.applovin.exoplayer2.g.e.e) {
                com.applovin.exoplayer2.g.e.e eVar = (com.applovin.exoplayer2.g.e.e) interfaceC0092aA;
                if ("iTunSMPB".equals(eVar.f6366b) && a(eVar.f6367c)) {
                    return true;
                }
            } else if (interfaceC0092aA instanceof com.applovin.exoplayer2.g.e.i) {
                com.applovin.exoplayer2.g.e.i iVar = (com.applovin.exoplayer2.g.e.i) interfaceC0092aA;
                if ("com.apple.iTunes".equals(iVar.f6378a) && "iTunSMPB".equals(iVar.f6379b) && a(iVar.f6380c)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
