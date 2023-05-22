<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
    <title>CRS</title>
</head>
<body>
    <header class="text-gray-600 body-font">
        <div class="container mx-auto flex flex-wrap p-5 flex-col md:flex-row items-center">
          <a class="flex title-font font-medium items-center text-gray-900 mb-4 md:mb-0">
            <svg xmlns="http://www.w3.org/2000/svg" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="w-10 h-10 text-white p-2 bg-indigo-500 rounded-full" viewBox="0 0 24 24">
              <path d="M12 2L2 7l10 5 10-5-10-5zM2 17l10 5 10-5M2 12l10 5 10-5"></path>
            </svg>
            <span class="ml-3 text-xl">CORPORATE RECRUITMENT MANAGEMENT</span>
          </a>
          <nav class="md:ml-auto flex flex-wrap items-center text-base justify-center">
            <a href="index.jsp" class="mr-5 hover:text-gray-900">Home</a>
            <a href="team.jsp" class="mr-5 hover:text-gray-900">About Us</a>
            <a href="contactus.jsp" class="mr-5 hover:text-gray-900">24x7 Help</a>
          </nav>
         <a href="index.jsp"><button class="inline-flex items-center bg-gray-100 border-0 py-1 px-3 focus:outline-none hover:bg-gray-200 rounded text-base mt-4 md:mt-0">Sign Out
            <svg fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="w-4 h-4 ml-1" viewBox="0 0 24 24">
              <path d="M5 12h14M12 5l7 7-7 7"></path>
            </svg>
          </button>
          </a> 
        </div>
      </header>
      <section class="text-gray-600 body-font">
        <div class="container px-5 py-24 mx-auto">
          <div class="flex flex-col text-center w-full mb-12">
            <h1 class="sm:text-3xl text-2xl font-medium title-font mb-4 text-gray-900">Scores of the candidates</h1>
          </div>
          
<div class="overflow-x-auto relative">
  <table class="w-full text-sm text-left text-gray-500 dark:text-gray-400">
      <thead class="text-xs text-gray-700 uppercase bg-gray-100 dark:bg-gray-700 dark:text-gray-400">
          <tr>
              <th scope="col" class="py-3 px-6 rounded-l-lg">
                  Candidate Name
              </th>
              <th scope="col" class="py-3 px-6">
                  Email
              </th>
              <th scope="col" class="py-3 px-6 rounded-r-lg">
                  Score Achieved(For 50)
              </th>
          </tr>
      </thead>
      <tbody>
          <tr class="bg-white dark:bg-gray-800">
              <th scope="row" class="py-4 px-6 font-medium text-gray-900 whitespace-nowrap dark:text-white">
                  Ramana
              </th>
              <td class="py-4 px-6">
                  rambo123@gmail.com
              </td>
              <td class="py-4 px-6">
                  40
              </td>
          </tr>
          <tr class="bg-white dark:bg-gray-800">
              <th scope="row" class="py-4 px-6 font-medium text-gray-900 whitespace-nowrap dark:text-white">
                  Karunya
              </th>
              <td class="py-4 px-6">
                  kar321@gmail.com
              </td>
              <td class="py-4 px-6">
                  30
              </td>
          </tr>
          <tr class="bg-white dark:bg-gray-800">
              <th scope="row" class="py-4 px-6 font-medium text-gray-900 whitespace-nowrap dark:text-white">
                  Ganesh
              </th>
              <td class="py-4 px-6">
                 Ganesh456@gmail.com
              </td>
              <td class="py-4 px-6">
                  50
              </td>
              <tr class="bg-white dark:bg-gray-800">
                <th scope="row" class="py-4 px-6 font-medium text-gray-900 whitespace-nowrap dark:text-white">
                    Karthikeya
                </th>
                <td class="py-4 px-6">
                   happy.karthikeya@gmail.com
                </td>
                <td class="py-4 px-6">
                    50
                </td>
                <tr class="bg-white dark:bg-gray-800">
                  <th scope="row" class="py-4 px-6 font-medium text-gray-900 whitespace-nowrap dark:text-white">
                      Basha
                  </th>
                  <td class="py-4 px-6">
                     basha12345678@gmail.com
                  </td>
                  <td class="py-4 px-6">
                      40
                  </td>
                  <tr class="bg-white dark:bg-gray-800">
                    <th scope="row" class="py-4 px-6 font-medium text-gray-900 whitespace-nowrap dark:text-white">
                        Karthik
                    </th>
                    <td class="py-4 px-6">
                       karthik.p@gmail.com
                    </td>
                    <td class="py-4 px-6">
                        40
                    </td>
          </tr>
      </tbody>
      
  </table>
</div>

        </div>
      </section>

</body>
</html>