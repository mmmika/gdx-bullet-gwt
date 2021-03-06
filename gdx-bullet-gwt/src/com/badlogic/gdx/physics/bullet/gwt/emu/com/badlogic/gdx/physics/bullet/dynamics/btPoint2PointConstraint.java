package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.math.Vector3;
import com.google.gwt.core.client.JavaScriptObject;

public class btPoint2PointConstraint extends btTypedConstraint
{

	public btPoint2PointConstraint(btRigidBody rbA, btRigidBody rbB, Vector3 pivotInA, Vector3 pivotInB)
	{
		jsObject = createObj(rbA, rbB, pivotInA, pivotInB);
	}

	public btPoint2PointConstraint(btRigidBody rbA, Vector3 pivotInA)
	{
		jsObject = createObj(rbA, pivotInA);
	}
	
	public static native JavaScriptObject createObj(btRigidBody rbA, btRigidBody rbB, Vector3 pivotInA, Vector3 pivotInB) /*-{
		var rBody1 = rbA.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var rBody2 = rbB.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x1 = pivotInA.@com.badlogic.gdx.math.Vector3::x;
		var y1 = pivotInA.@com.badlogic.gdx.math.Vector3::y;
		var z1 = pivotInA.@com.badlogic.gdx.math.Vector3::z;
		var x2 = pivotInB.@com.badlogic.gdx.math.Vector3::x;
		var y2 = pivotInB.@com.badlogic.gdx.math.Vector3::y;
		var z2 = pivotInB.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector1.setValue(x1,y1,z1);
		var tmpbtVector2 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_2;
		tmpbtVector2.setValue(x2,y2,z2);
		var obj = new $wnd.Ammo.btPoint2PointConstraint(rBody1, rBody2, tmpbtVector1, tmpbtVector2);
		return obj;
	}-*/;
	
	public static native JavaScriptObject createObj(btRigidBody rbA, Vector3 pivotInA) /*-{
		var rBody1 = rbA.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x1 = pivotInA.@com.badlogic.gdx.math.Vector3::x;
		var y1 = pivotInA.@com.badlogic.gdx.math.Vector3::y;
		var z1 = pivotInA.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector1 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector1.setValue(x1,y1,z1);
		var obj = new $wnd.Ammo.btPoint2PointConstraint(rBody1, tmpbtVector1);
		return obj;
	}-*/;
	
	public native void setPivotA(Vector3 pivotA) /*-{ 
		var pointConst = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = pivotA.@com.badlogic.gdx.math.Vector3::x;
		var y = pivotA.@com.badlogic.gdx.math.Vector3::y;
		var z = pivotA.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		pointConst.setPivotA(tmpbtVector);
	}-*/;
	
	public native void setPivotB(Vector3 pivotB) /*-{ 
		var pointConst = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var x = pivotB.@com.badlogic.gdx.math.Vector3::x;
		var y = pivotB.@com.badlogic.gdx.math.Vector3::y;
		var z = pivotB.@com.badlogic.gdx.math.Vector3::z;
		var tmpbtVector = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btVector3js_1;
		tmpbtVector.setValue(x,y,z);
		pointConst.setPivotB(tmpbtVector);
	}-*/;
	
	public native Vector3 getPivotInA() /*-{ 
		var pointConst = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var vector3JS = pointConst.getPivotInA();
		var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
		tmpVector3.@com.badlogic.gdx.math.Vector3::x = vector3JS.x();
		tmpVector3.@com.badlogic.gdx.math.Vector3::y = vector3JS.y();
		tmpVector3.@com.badlogic.gdx.math.Vector3::z = vector3JS.z();
		return tmpVector3;
	}-*/;
	
	public native Vector3 getPivotInB() /*-{ 
		var vector3JS = pointConst.getPivotInB();
		var tmpVector3 = @com.badlogic.gdx.physics.bullet.Bullet::TMP_Vector3_1;
		tmpVector3.@com.badlogic.gdx.math.Vector3::x = vector3JS.x();
		tmpVector3.@com.badlogic.gdx.math.Vector3::y = vector3JS.y();
		tmpVector3.@com.badlogic.gdx.math.Vector3::z = vector3JS.z();
		return tmpVector3;
	}-*/;
	
	public native void setSetting(btConstraintSetting value) /*-{
		var pointConst = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var settingsJS = value.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		pointConst.set_m_setting(settingsJS);
	}-*/;
	
	public native btConstraintSetting getSetting() /*-{
		var pointConst = this.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject;
		var tmpSettings = @com.badlogic.gdx.physics.bullet.Bullet::TMP_btConstraintSetting_1;
		tmpSettings.@com.badlogic.gdx.physics.bullet.BulletBase::jsObject = pointConst.get_m_setting();
		return tmpSettings;
	}-*/;
	
}
