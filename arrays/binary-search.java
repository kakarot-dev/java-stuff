class Main {
public static int binarySearch(int a[], int l, int h, int x)
{
if (h >= l) {
int mid = l + (h - l) / 2;
if (a[mid] == x)
return mid;
if (a[mid] > x)
return binarySearch(a, l, mid - 1, x);
return binarySearch(a, mid + 1, h, x);
}
return -1;
}
public static void main(String[] args)
{
int a[] = { 20, 30, 40, 10, 50, 100 };
int n = a.length;
int x = 40;
int res = binarySearch(a, 0, n - 1, x);
if (res == -1)
System.out.println("Element not present");
else
System.out.println("Element found at index " + res);
}
}