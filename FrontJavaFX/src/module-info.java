module FrontJavaFX {
	requires javafx.controls;
	
	requires transitive javafx.base;
	requires transitive javafx.graphics;
	requires java.desktop;
	requires java.base;
	
	exports FrontJavaFX;
}