using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace CreateFiles
{
    class Program
    {
        private const Int32 FILES_TOTAL = 1;
        private const String DIR_PATH = "../php-service/html/files/";
        private const String FILE_LABEL = "test-file-";
        private const String FILE_EXTENSION = ".txt";

        static void Main(string[] args)
        {
            String[] fileNames;

            fileNames = GenerateFileNames();
            UnPopulate(fileNames);
            Populate(fileNames);
        }

        private static String[] GenerateFileNames()
        {
            String[] fileNames = new String[FILES_TOTAL];
            String fName;
            Int32 fId;
            for (Int32 i = 0; i < FILES_TOTAL; i++)
            {
                fId = i + 1;
                fName = DIR_PATH + FILE_LABEL + fId + FILE_EXTENSION;
                fileNames[i] = fName;
            }

            return fileNames;
        }

        private static void UnPopulate(String[] fileNames)
        {
            String fileRegexName = FILE_LABEL + "*" + FILE_EXTENSION;
            String[] directoryfileNames = Directory.GetFiles(DIR_PATH, fileRegexName);
            IEnumerable<String> fileNamesToDelete = directoryfileNames.Except(fileNames);
            fileNamesToDelete.ToList().ForEach(fileName => File.Delete(fileName));
        }

        private static void Populate(String[] fileNames)
        {
            IEnumerable<String> filesToPopulate = fileNames.Where(fileName => !File.Exists(fileName));
            filesToPopulate.ToList().ForEach(fileName => File.Create(fileName).Dispose());
        }
    }
}
