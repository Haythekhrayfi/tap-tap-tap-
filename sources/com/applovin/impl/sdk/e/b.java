package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.applovin.impl.adview.a0;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.applovin.impl.sdk.e.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f10511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.e f10512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f10513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.d.e f10514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f10515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private StringBuffer f10516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Object f10517k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ExecutorService f10518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<c> f10519m;

    public interface a {
        void a(String str, boolean z10);
    }

    public b(String str, com.applovin.impl.sdk.ad.e eVar, List<String> list, com.applovin.impl.sdk.d.e eVar2, ExecutorService executorService, com.applovin.impl.sdk.o oVar, a aVar) {
        super("AsyncTaskCacheHTMLResources", oVar);
        this.f10511e = str;
        this.f10512f = eVar;
        this.f10513g = list;
        this.f10514h = eVar2;
        this.f10518l = executorService;
        this.f10515i = aVar;
        this.f10516j = new StringBuffer(str);
        this.f10517k = new Object();
    }

    private void a(String str) {
        a aVar;
        if (this.f10500d.get() || (aVar = this.f10515i) == null) {
            return;
        }
        aVar.a(str, false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    private List<c> c() {
        ArrayList arrayList = new ArrayList();
        Collection<Character> collectionD = d();
        for (final String str : this.f10513g) {
            int iIndexOf = 0;
            int i10 = 0;
            char c10 = 0;
            while (iIndexOf < this.f10511e.length()) {
                if (this.f10500d.get()) {
                    return null;
                }
                iIndexOf = this.f10511e.indexOf(str, i10);
                if (iIndexOf == -1) {
                    break;
                }
                int length = this.f10511e.length();
                int i11 = iIndexOf;
                while (!collectionD.contains(Character.valueOf(this.f10511e.charAt(i11))) && i11 < length) {
                    i11++;
                }
                if (i11 <= iIndexOf || i11 == length) {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f10499c.e(this.f10498b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return null;
                }
                final String strSubstring = this.f10511e.substring(str.length() + iIndexOf, i11);
                if (StringUtils.isValidString(strSubstring)) {
                    if (this.f10512f.aR()) {
                        if (!this.f10512f.d().equals(str + strSubstring)) {
                            final String strA = i.f.a(str, strSubstring);
                            com.applovin.impl.sdk.ad.e eVar = this.f10512f;
                            String[] strArr = new String[1];
                            strArr[c10] = str;
                            arrayList.add(new c(strA, eVar, Arrays.asList(strArr), true, this.f10514h, this.f10497a, new c.a() { // from class: com.applovin.impl.sdk.e.b.1
                                @Override // com.applovin.impl.sdk.e.c.a
                                public void a(Uri uri) {
                                    if (uri != null) {
                                        synchronized (b.this.f10517k) {
                                            int iIndexOf2 = b.this.f10516j.indexOf(strA);
                                            b.this.f10516j.replace(iIndexOf2, strA.length() + iIndexOf2, uri.toString());
                                        }
                                        b.this.f10512f.b(uri);
                                        b.this.f10514h.b();
                                        return;
                                    }
                                    if (b.this.f10512f.K().contains(str + strSubstring) && b.this.f10515i != null) {
                                        b.this.f10515i.a(b.this.f10511e, true);
                                    }
                                    b.this.f10514h.c();
                                }
                            }));
                        } else if (com.applovin.impl.sdk.y.a()) {
                            this.f10499c.b(this.f10498b, "Postponing caching for \"" + strSubstring + "\" video resource");
                        }
                    } else {
                        final String strA2 = i.f.a(str, strSubstring);
                        com.applovin.impl.sdk.ad.e eVar2 = this.f10512f;
                        String[] strArr2 = new String[1];
                        strArr2[c10] = str;
                        arrayList.add(new c(strA2, eVar2, Arrays.asList(strArr2), true, this.f10514h, this.f10497a, new c.a() { // from class: com.applovin.impl.sdk.e.b.1
                            @Override // com.applovin.impl.sdk.e.c.a
                            public void a(Uri uri) {
                                if (uri != null) {
                                    synchronized (b.this.f10517k) {
                                        int iIndexOf2 = b.this.f10516j.indexOf(strA2);
                                        b.this.f10516j.replace(iIndexOf2, strA2.length() + iIndexOf2, uri.toString());
                                    }
                                    b.this.f10512f.b(uri);
                                    b.this.f10514h.b();
                                    return;
                                }
                                if (b.this.f10512f.K().contains(str + strSubstring) && b.this.f10515i != null) {
                                    b.this.f10515i.a(b.this.f10511e, true);
                                }
                                b.this.f10514h.c();
                            }
                        }));
                    }
                } else if (com.applovin.impl.sdk.y.a()) {
                    a0.a("Skip caching of non-resource ", strSubstring, this.f10499c, this.f10498b);
                }
                c10 = 0;
                i10 = i11;
            }
        }
        return arrayList;
    }

    private Collection<Character> d() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f10497a.a(com.applovin.impl.sdk.c.b.bB)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add(Character.valueOf(CoreConstants.DOUBLE_QUOTE_CHAR));
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() throws Exception {
        if (this.f10500d.get()) {
            return Boolean.FALSE;
        }
        if (!TextUtils.isEmpty(this.f10511e)) {
            if (((Boolean) this.f10497a.a(com.applovin.impl.sdk.c.b.bC)).booleanValue()) {
                this.f10519m = c();
                if (this.f10500d.get()) {
                    return Boolean.FALSE;
                }
                List<c> list = this.f10519m;
                if (list != null && !list.isEmpty()) {
                    if (com.applovin.impl.sdk.y.a()) {
                        com.applovin.impl.sdk.y yVar = this.f10499c;
                        String str = this.f10498b;
                        StringBuilder sbA = defpackage.a.a("Executing ");
                        sbA.append(this.f10519m.size());
                        sbA.append(" caching operations...");
                        yVar.b(str, sbA.toString());
                    }
                    this.f10518l.invokeAll(this.f10519m);
                    synchronized (this.f10517k) {
                        a(this.f10516j.toString());
                    }
                    return Boolean.TRUE;
                }
            } else if (com.applovin.impl.sdk.y.a()) {
                this.f10499c.b(this.f10498b, "Resource caching is disabled, skipping cache...");
            }
        }
        a(this.f10511e);
        return Boolean.FALSE;
    }
}
