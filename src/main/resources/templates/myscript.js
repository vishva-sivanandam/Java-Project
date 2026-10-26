function showCourses() {

    fetch("http://localhost:8080/course")
        .then(response => response.json())
        .then(courses => {

            const table = document.getElementById("coursetable");

            table.innerHTML = "";

            courses.forEach(course => {

                const row = `
                    <tr>
                        <td>${course.courseId}</td>
                        <td>${course.courseName}</td>
                        <td>${course.courseTrainer}</td>
                        <td>${course.courseDuration}</td>
                    </tr>
                `;

                table.innerHTML += row;
            });
        })
        .catch(error => {
            console.error("Error:", error);
        });
}

function showEnrolledStudents() {

    fetch("http://localhost:8080/course/enrolled")
        .then(response => {
            if (!response.ok) {
                throw new Error("HTTP Error: " + response.status);
            }

            return response.json();
        })
        .then(students => {

            const table = document.getElementById("enrolledtable");

            table.innerHTML = "";

            students.forEach(student => {

                const row = `
                    <tr>
                        <td>${student.id}</td>
                        <td>${student.name}</td>
                        <td>${student.emailId}</td>
                        <td>${student.courseName}</td>
                    </tr>
                `;

                table.innerHTML += row;
            });

        })
        .catch(error => {
            console.error("Error fetching enrolled students:", error);
        });
}