CREATE TABLE `course` (
  `id` 			int NOT NULL AUTO_INCREMENT,
  `name_course` varchar(100) NOT NULL,
  `teacher` 	varchar(100) NOT NULL,
  `description` varchar(200),
  `createdAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `deletedAt` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;


CREATE TABLE `students` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `age` int(20) NOT NULL,
  `createdAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `deletedAt` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;


-- INSERT ---
INSERT INTO students (name, lastName, age) 
VALUES 
    ('Juan', 'González', 25),
    ('María', 'Martínez', 22),
    ('Carlos', 'López', 20),
    ('Ana', 'Sánchez', 23),
    ('Pedro', 'Rodríguez', 21);
	
INSERT INTO course (name_course, teacher, description) 
VALUES 
    ('Matemáticas', 'Profesor García', 'Curso introductorio de matemáticas.'),
    ('Historia', 'Profesora Martínez', 'Curso sobre la historia del mundo antiguo.'),
    ('Programación', 'Profesor Pérez', 'Curso básico de programación en Python.'),
    ('Inglés', 'Profesora Rodríguez', 'Curso de inglés para principiantes.'),
    ('Física', 'Profesor Gómez', 'Curso avanzado de física teórica.');
	
	
	