package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.y0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p0.m;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f31139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f31140f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f31141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f31142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f31143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f31144d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Class<?>[] f31145e = {MenuItem.class};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f31146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Method f31147d;

        public a(Object obj, String str) {
            this.f31146c = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f31147d = cls.getMethod(str, f31145e);
            } catch (Exception e10) {
                StringBuilder sbA = androidx.activity.result.c.a("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbA.append(cls.getName());
                InflateException inflateException = new InflateException(sbA.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f31147d.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f31147d.invoke(this.f31146c, menuItem)).booleanValue();
                }
                this.f31147d.invoke(this.f31146c, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Menu f31148a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f31155h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f31156i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f31157j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f31158k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f31159l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f31160m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f31161n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f31162o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f31163p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f31164q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f31165r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f31166s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f31167t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f31168u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f31169v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f31170w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f31171x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f31172y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public p0.b f31173z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f31149b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f31150c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f31151d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f31152e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f31153f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f31154g = true;

        public b(Menu menu) {
            this.f31148a = menu;
        }

        public SubMenu a() {
            this.f31155h = true;
            SubMenu subMenuAddSubMenu = this.f31148a.addSubMenu(this.f31149b, this.f31156i, this.f31157j, this.f31158k);
            c(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f31143c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        public final void c(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f31166s).setVisible(this.f31167t).setEnabled(this.f31168u).setCheckable(this.f31165r >= 1).setTitleCondensed(this.f31159l).setIcon(this.f31160m);
            int i10 = this.f31169v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f31172y != null) {
                if (g.this.f31143c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                g gVar = g.this;
                if (gVar.f31144d == null) {
                    gVar.f31144d = gVar.a(gVar.f31143c);
                }
                menuItem.setOnMenuItemClickListener(new a(gVar.f31144d, this.f31172y));
            }
            if (this.f31165r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).k(true);
                } else if (menuItem instanceof j.c) {
                    j.c cVar = (j.c) menuItem;
                    try {
                        if (cVar.f31667e == null) {
                            cVar.f31667e = cVar.f31666d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        cVar.f31667e.invoke(cVar.f31666d, Boolean.TRUE);
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str = this.f31171x;
            if (str != null) {
                menuItem.setActionView((View) b(str, g.f31139e, g.this.f31141a));
                z10 = true;
            }
            int i11 = this.f31170w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            p0.b bVar = this.f31173z;
            if (bVar != null) {
                if (menuItem instanceof j0.b) {
                    ((j0.b) menuItem).a(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z11 = menuItem instanceof j0.b;
            if (z11) {
                ((j0.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                m.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z11) {
                ((j0.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                m.m(menuItem, charSequence2);
            }
            char c10 = this.f31161n;
            int i12 = this.f31162o;
            if (z11) {
                ((j0.b) menuItem).setAlphabeticShortcut(c10, i12);
            } else if (Build.VERSION.SDK_INT >= 26) {
                m.g(menuItem, c10, i12);
            }
            char c11 = this.f31163p;
            int i13 = this.f31164q;
            if (z11) {
                ((j0.b) menuItem).setNumericShortcut(c11, i13);
            } else if (Build.VERSION.SDK_INT >= 26) {
                m.k(menuItem, c11, i13);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z11) {
                    ((j0.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    m.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z11) {
                    ((j0.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    m.i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f31139e = clsArr;
        f31140f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f31143c = context;
        Object[] objArr = {context};
        this.f31141a = objArr;
        this.f31142b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e4 A[PHI: r9
  0x00e4: PHI (r9v2 boolean) = 
  (r9v1 boolean)
  (r9v1 boolean)
  (r9v1 boolean)
  (r9v1 boolean)
  (r9v1 boolean)
  (r9v4 boolean)
  (r9v1 boolean)
  (r9v1 boolean)
  (r9v1 boolean)
  (r9v1 boolean)
 binds: [B:40:0x00a4, B:80:0x0207, B:44:0x00b3, B:17:0x0045, B:38:0x00a0, B:39:0x00a2, B:30:0x0078, B:36:0x0088, B:35:0x0084, B:26:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        p0.b bVar;
        ColorStateList colorStateListC;
        b bVar2 = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(f.a("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z11 && name2.equals(str)) {
                        str = null;
                        z11 = false;
                    } else if (name2.equals("group")) {
                        bVar2.f31149b = 0;
                        bVar2.f31150c = 0;
                        bVar2.f31151d = 0;
                        bVar2.f31152e = 0;
                        bVar2.f31153f = true;
                        bVar2.f31154g = true;
                    } else if (name2.equals("item")) {
                        if (!bVar2.f31155h) {
                            p0.b bVar3 = bVar2.f31173z;
                            if (bVar3 == null || !bVar3.a()) {
                                bVar2.f31155h = true;
                                bVar2.c(bVar2.f31148a.add(bVar2.f31149b, bVar2.f31156i, bVar2.f31157j, bVar2.f31158k));
                            } else {
                                bVar2.a();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z10 = true;
                    }
                }
            } else if (!z11) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    TypedArray typedArrayObtainStyledAttributes = g.this.f31143c.obtainStyledAttributes(attributeSet, d.a.f28474p);
                    bVar2.f31149b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    bVar2.f31150c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    bVar2.f31151d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    bVar2.f31152e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    bVar2.f31153f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                    bVar2.f31154g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    y0 y0VarQ = y0.q(g.this.f31143c, attributeSet, d.a.f28475q);
                    bVar2.f31156i = y0VarQ.m(2, 0);
                    bVar2.f31157j = (y0VarQ.j(5, bVar2.f31150c) & (-65536)) | (y0VarQ.j(6, bVar2.f31151d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                    bVar2.f31158k = y0VarQ.o(7);
                    bVar2.f31159l = y0VarQ.o(8);
                    bVar2.f31160m = y0VarQ.m(0, 0);
                    String strN = y0VarQ.n(9);
                    bVar2.f31161n = strN == null ? (char) 0 : strN.charAt(0);
                    bVar2.f31162o = y0VarQ.j(16, 4096);
                    String strN2 = y0VarQ.n(10);
                    bVar2.f31163p = strN2 == null ? (char) 0 : strN2.charAt(0);
                    bVar2.f31164q = y0VarQ.j(20, 4096);
                    bVar2.f31165r = y0VarQ.p(11) ? y0VarQ.a(11, false) : bVar2.f31152e;
                    bVar2.f31166s = y0VarQ.a(3, false);
                    bVar2.f31167t = y0VarQ.a(4, bVar2.f31153f);
                    bVar2.f31168u = y0VarQ.a(1, bVar2.f31154g);
                    bVar2.f31169v = y0VarQ.j(21, -1);
                    bVar2.f31172y = y0VarQ.n(12);
                    bVar2.f31170w = y0VarQ.m(13, 0);
                    bVar2.f31171x = y0VarQ.n(15);
                    String strN3 = y0VarQ.n(14);
                    boolean z12 = strN3 != null;
                    if (z12 && bVar2.f31170w == 0 && bVar2.f31171x == null) {
                        bVar = (p0.b) bVar2.b(strN3, f31140f, g.this.f31142b);
                    } else {
                        if (z12) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        bVar = null;
                    }
                    bVar2.f31173z = bVar;
                    bVar2.A = y0VarQ.o(17);
                    bVar2.B = y0VarQ.o(22);
                    if (y0VarQ.p(19)) {
                        bVar2.D = c0.d(y0VarQ.j(19, -1), bVar2.D);
                        colorStateListC = null;
                    } else {
                        colorStateListC = null;
                        bVar2.D = null;
                    }
                    if (y0VarQ.p(18)) {
                        colorStateListC = y0VarQ.c(18);
                    }
                    bVar2.C = colorStateListC;
                    y0VarQ.f1412b.recycle();
                    bVar2.f31155h = false;
                } else if (name3.equals("menu")) {
                    b(xmlPullParser, attributeSet, bVar2.a());
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i10, Menu menu) {
        if (!(menu instanceof j0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f31143c.getResources().getLayout(i10);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (XmlPullParserException e10) {
                    throw new InflateException("Error inflating menu XML", e10);
                }
            } catch (IOException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
