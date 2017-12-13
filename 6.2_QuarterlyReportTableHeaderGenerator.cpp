using namespace std;

class QuarterlyReportTableHeaderGenerator
{
public:
    string generate();
};

string QuarterlyReportTableHeaderGenerator::generate()
{
    return "<tr><td>Department</td><td>Manager</td>"
        "<td>Profit</td><td>Expenses</td>";
}