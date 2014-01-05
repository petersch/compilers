#include <stdlib.h>
#include <stdio.h>

void write_int(int i) {
	printf("%d", i);
}

void write_bool(int b) {
	if (b) printf("true");
	else printf("false");
}

void write_str(char* s) {
	printf("%s", s);
}

void write_nl() {
	printf("\n");
}

void read_int(int* i) {
	scanf("%d", i);
}

