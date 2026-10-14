package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.id3.CommentFrame;
import com.yandex.mobile.ads.exo.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class yx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f27157c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27158a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f27159b = -1;

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    /* JADX WARN: Code duplicated, block: B:32:0x008e  */
    public final void a(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.c(); i10++) {
            Metadata.Entry entryA = metadata.a(i10);
            boolean z10 = true;
            if (entryA instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryA;
                if ("iTunSMPB".equals(commentFrame.f18577c)) {
                    Matcher matcher = f27157c.matcher(commentFrame.f18578d);
                    if (matcher.find()) {
                        try {
                            String strGroup = matcher.group(1);
                            int i11 = da1.f19803a;
                            int i12 = Integer.parseInt(strGroup, 16);
                            int i13 = Integer.parseInt(matcher.group(2), 16);
                            if (i12 > 0 || i13 > 0) {
                                this.f27158a = i12;
                                this.f27159b = i13;
                            } else {
                                z10 = false;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return;
                    }
                } else {
                    continue;
                }
            } else if (entryA instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryA;
                if ("com.apple.iTunes".equals(internalFrame.f18584b) && "iTunSMPB".equals(internalFrame.f18585c)) {
                    Matcher matcher2 = f27157c.matcher(internalFrame.f18586d);
                    if (matcher2.find()) {
                        try {
                            String strGroup2 = matcher2.group(1);
                            int i14 = da1.f19803a;
                            int i15 = Integer.parseInt(strGroup2, 16);
                            int i16 = Integer.parseInt(matcher2.group(2), 16);
                            if (i15 > 0 || i16 > 0) {
                                this.f27158a = i15;
                                this.f27159b = i16;
                            } else {
                                z10 = false;
                            }
                        } catch (NumberFormatException unused2) {
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        return;
                    }
                }
            } else {
                continue;
            }
        }
    }
}
