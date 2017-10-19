package net.jonathanfischer.edgetest.client;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Google's version of Location currently packaged in Elemental2 doesn't expose any of the object's
 * properties, so you can't, say, inspect the hash portion. Or the URL, really. Or anything. So we
 * have to include our own copy here and cast to it to get to anything.
 */
@JsType(isNative = true, name = "Location", namespace = JsPackage.GLOBAL)
public class Location
{

	public native void assign(String newLocation);
	public native void replace(String newLocation);
	public native void reload();
	public native String toString();

	public String href;
	public String protocol;
	public String host;
	public String hostname;
	public String port;
	public String pathname;
	public String search;
	public String hash;
	public String username;
	public String password;
	public String origin;
}

