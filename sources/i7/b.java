package i7;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.j0;
import java.util.LinkedHashMap;
import java.util.Map;
import jc.w;
import vc.g;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<Integer, View> f31299c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        this(context, null, 0, 6, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.f31299c = new LinkedHashMap();
        FrameLayout.inflate(context, R.layout.accessibility_dialog, this);
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i10, int i11, g gVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public View a(int i10) {
        Map<Integer, View> map = this.f31299c;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    public final void b(final WindowManager windowManager, String str, String str2, String str3, final uc.a<w> aVar, final uc.a<w> aVar2) {
        j0.i(aVar2, "negativeButtonAction");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2032, 8, -3);
        layoutParams.windowAnimations = R.style.PopupAnimation;
        layoutParams.gravity = 17;
        ((TextView) a(R.id.dialogText)).setText(str);
        ((Button) a(R.id.dialogPositiveButton)).setText(str2);
        ((Button) a(R.id.dialogNegativeButton)).setText(str3);
        final int i10 = 0;
        ((Button) a(R.id.dialogPositiveButton)).setOnClickListener(new View.OnClickListener() { // from class: i7.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        uc.a aVar3 = aVar;
                        WindowManager windowManager2 = windowManager;
                        b bVar = this;
                        j0.i(aVar3, "$positiveButtonAction");
                        j0.i(windowManager2, "$windowManager");
                        j0.i(bVar, "this$0");
                        aVar3.invoke();
                        windowManager2.removeView(bVar);
                        break;
                    default:
                        uc.a aVar4 = aVar;
                        WindowManager windowManager3 = windowManager;
                        b bVar2 = this;
                        j0.i(aVar4, "$negativeButtonAction");
                        j0.i(windowManager3, "$windowManager");
                        j0.i(bVar2, "this$0");
                        aVar4.invoke();
                        windowManager3.removeView(bVar2);
                        break;
                }
            }
        });
        final int i11 = 1;
        ((Button) a(R.id.dialogNegativeButton)).setOnClickListener(new View.OnClickListener() { // from class: i7.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        uc.a aVar3 = aVar2;
                        WindowManager windowManager2 = windowManager;
                        b bVar = this;
                        j0.i(aVar3, "$positiveButtonAction");
                        j0.i(windowManager2, "$windowManager");
                        j0.i(bVar, "this$0");
                        aVar3.invoke();
                        windowManager2.removeView(bVar);
                        break;
                    default:
                        uc.a aVar4 = aVar2;
                        WindowManager windowManager3 = windowManager;
                        b bVar2 = this;
                        j0.i(aVar4, "$negativeButtonAction");
                        j0.i(windowManager3, "$windowManager");
                        j0.i(bVar2, "this$0");
                        aVar4.invoke();
                        windowManager3.removeView(bVar2);
                        break;
                }
            }
        });
        windowManager.addView(this, layoutParams);
    }
}
