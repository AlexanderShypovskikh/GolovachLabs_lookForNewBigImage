# io.file.look_for_new_big_image
    Этот пример кода - проходит по всей директории (включая вложенные) и выводит имена всех файлов в консоль
     Модифицируйте/допишите его, что бы он
    1) Собирал только имена файлов, которые представляют собой большие (File.length() > 1024*1024) картинки (имя файла заканчивается (String.endsWith(String)) на ".jpg"/".png"/".bmp"/".gif".
    2) Собирал массив файлов, а не выводил в консоль.
    3) Для реализации пункта 1 рекомендуется (но не обязательно) использовать FileFilter
