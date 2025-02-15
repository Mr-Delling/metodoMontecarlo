# Nombre del compilador de Java
JAVAC = javac
# Ruta a las carpetas de código fuente y de salida
SRC_DIR = src
BIN_DIR = bin
# Paquetes y clases
CLASSES = $(SRC_DIR)/mates/Matematicas.java $(SRC_DIR)/aplicacion/MetodoMontecarloP1.java
# Nombre del programa principal (sin .java)
MAIN_CLASS = aplicacion.MetodoMontecarloP1

# Compila los archivos Java
all: $(CLASSES)
	@mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $(CLASSES)
	@echo "Compilación completada."

# Ejecuta el programa
run:
	@java -cp $(BIN_DIR) $(MAIN_CLASS)

# Ejecuta el programa con argumentos
run_args:
	@java -cp $(BIN_DIR) $(MAIN_CLASS) 10000

# Limpia los archivos compilados
clean:
	@rm -rf $(BIN_DIR)/*
	@echo "Archivos compilados eliminados."
